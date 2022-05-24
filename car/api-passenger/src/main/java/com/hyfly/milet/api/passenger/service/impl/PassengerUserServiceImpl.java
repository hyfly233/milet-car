package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.common.CacheUtil;
import com.hyfly.milet.api.passenger.dao.PassengerUserBaseDao;
import com.hyfly.milet.api.passenger.service.PassengerUserService;
import com.hyfly.milet.common.constant.RedisKeyPrefixConstant;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.entity.PassengerUserBase;
import com.hyfly.milet.common.util.JwtInfo;
import com.hyfly.milet.common.util.JwtUtil;
import com.hyfly.milet.common.util.SnowflakeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class PassengerUserServiceImpl implements PassengerUserService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Resource
    private PassengerUserBaseDao passengerUserBaseDao;

    @Override
    public ResponseResult login(String passengerPhone) {
        log.info("用户请求手机号登陆：" + passengerPhone);
        // 通过手机号 获取乘客 ID （不存在则创建个新乘客）
        final Serializable passengerId = getOrNewPassengerIdByPhone(passengerPhone);

        // 生成 token 的时候，如果要服务端控制，要把它 存到 redis中，在设置过期时间
        final String token = JwtUtil.createToken(passengerId + "", new Date());

        // 存入redis，设置过期时间
        BoundValueOperations<String, String> stringStringBoundValueOperations
                = redisTemplate.boundValueOps(RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE + passengerId);
        stringStringBoundValueOperations.set(token, 30, TimeUnit.DAYS);

        log.info("用户手机号:" + passengerPhone + " 登陆成功，token：" + token);
        return ResponseResult.success(token);
    }


    /**
     * 通过手机号获取乘客基础数据，若没有，则创建一个新的
     *
     * @param passengerPhone 手机号
     * @return 乘客ID
     */
    private Serializable getOrNewPassengerIdByPhone(String passengerPhone) {
        Serializable passengerId = getPassengerIdByPhone(passengerPhone);
        if (passengerId == null) {
            return newPassengerUserBase(passengerPhone).getId();
        }
        return passengerId;
    }

    /**
     * 通过手机号 获取乘客ID
     *
     * @param passengerPhone passengerPhone
     * @return 乘客ID
     */
    private Serializable getPassengerIdByPhone(String passengerPhone) {
        Serializable passengerId = null;
        // 1、先从缓存取用户ID
        Cache cache = CacheUtil.passengerCache();
        if (cache != null) {
            passengerId = cache.get(passengerPhone, Serializable.class);
            // 2、取不到 再到数据库查询
            if (passengerId == null) {
                log.info("缓存未能命中乘客手机号：" + passengerPhone);
                final PassengerUserBase passengerUserBase = passengerUserBaseDao.selectByPhone(passengerPhone);
                if (passengerUserBase != null) {
                    passengerId = passengerUserBase.getId();
                    log.info("DB 中查询到此手机号：" + passengerPhone + " 对应用户ID：" + passengerId);
                }
            }
            // 3、存入缓存(更新) 不管是否存在
            cache.put(passengerPhone, passengerId);
            // 4、返回 乘客ID

        } else {
            log.info("缓存未能命中乘客手机号：" + passengerPhone);
            final PassengerUserBase passengerUserBase = passengerUserBaseDao.selectByPhone(passengerPhone);
            if (passengerUserBase != null) {
                passengerId = passengerUserBase.getId();
                log.info("DB 中查询到此手机号：" + passengerPhone + " 对应用户ID：" + passengerId);
            }
        }

        return passengerId;
    }

    /**
     * 创建一个新的 乘客
     *
     * @param passengerPhone passengerPhone
     * @return 新增的乘客基础数据
     */
    private PassengerUserBase newPassengerUserBase(String passengerPhone) {
        final long genId = SnowflakeUtils.genId();
        PassengerUserBase passengerInfo = new PassengerUserBase();
        passengerInfo.setLoginName(passengerPhone);
        passengerInfo.setPhone(passengerPhone);
        passengerInfo.setNickName(passengerPhone);
        passengerInfo.setCreateUserId(genId);
        passengerInfo.setId(genId);
        passengerInfo.setCreateDate(new Date());
        passengerInfo.setRegisterDate(new Date());
        passengerInfo.setGender(PassengerUserBase.GENDER_UNKNOWN);
        passengerInfo.setLockFlag(PassengerUserBase.LOCK_FLAG_PASS);
        passengerUserBaseDao.insert(passengerInfo);
        log.info("创建新乘客数据：" + passengerInfo);
//        CacheUtil.passengerCache().put(passengerPhone, passengerInfo.getId());
        return passengerInfo;
    }

    /**
     * 通过 token 登出
     *
     * @param token token
     * @return jwtInfo
     */
    @Override
    public ResponseResult logout(String token) {
        // 1、解析 token 获取乘客 id
        final JwtInfo jwtInfo = JwtUtil.parseToken(token);
        if (jwtInfo == null) {
            log.info("乘客Token解析失败：" + token);
            return ResponseResult.fail("JWT 解析失败 null");
        }

        log.info("解析乘客 Token 对应乘客 JWT信息：" + jwtInfo);

        // 2、删除 redis 中 token
        if (setExpireToken(jwtInfo.getSubject())) {
            log.info("乘客Token缓存清除成功：" + jwtInfo);
        } else {
            log.info("乘客Token缓存清除失败：" + jwtInfo);
        }
        return ResponseResult.success(jwtInfo);
    }

    /**
     * 删除 redis 中乘客ID 对应的 token
     *
     * @param passengerId passengerId
     * @return boolean
     */
    private boolean setExpireToken(String passengerId) {
        String key = RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE + passengerId;
        return Objects.equals(redisTemplate.delete(key), Boolean.TRUE);
    }
}