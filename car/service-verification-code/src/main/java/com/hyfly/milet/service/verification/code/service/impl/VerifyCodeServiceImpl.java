package com.hyfly.milet.service.verification.code.service.impl;

import com.hyfly.milet.common.constant.RedisKeyPrefixConstant;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.VerifyCodeResponse;
import com.hyfly.milet.common.enums.CommonStatusEnum;
import com.hyfly.milet.common.enums.IdentityEnum;
import com.hyfly.milet.service.verification.code.service.VerifyCodeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 验证码 Service
 *
 * @author hyfly
 */
@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 生成6位验证码
     * todo 需要三档验证 不能无限制发短信 redis 1分钟3次后5分钟不能发 1小时10次 24小时不能发
     *
     * @param identity    identity
     * @param phoneNumber phoneNumber
     * @return ResponseResult
     */
    @Override
    public ResponseResult generate(int identity, String phoneNumber) {
        // 生成6位验证码
        String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));

        String keyPre = generateKeyPreByIdentity(identity);
        String key = keyPre + phoneNumber;

        BoundValueOperations<String, String> codeRedis = redisTemplate.boundValueOps(key);

        codeRedis.set(code, 2, TimeUnit.MINUTES);

        VerifyCodeResponse result = new VerifyCodeResponse();
        result.setCode(code);
        return ResponseResult.success(result);
    }

    /**
     * todo 三档验证
     *
     * @param identity
     * @param phoneNumber
     * @param code
     * @return
     */
    @Override
    public ResponseResult verify(int identity, String phoneNumber, String code) {

        // 生成redis key
        String keyPre = generateKeyPreByIdentity(identity);
        String key = keyPre + phoneNumber;
        BoundValueOperations<String, String> codeRedis = redisTemplate.boundValueOps(key);
        String redisCode = codeRedis.get();

        if (StringUtils.isNotBlank(code) && StringUtils.isNotBlank(redisCode) && code.trim().equals(redisCode.trim())) {
            return ResponseResult.success("success");
        } else {
            return ResponseResult.fail(CommonStatusEnum.VERIFY_CODE_ERROR.getCode(),
                    CommonStatusEnum.VERIFY_CODE_ERROR.getValue());
        }
    }

    /**
     * 根据身份类型生成对应的缓存key
     *
     * @param identity
     * @return
     */
    private String generateKeyPreByIdentity(int identity) {
        String keyPre = "";
        if (identity == IdentityEnum.PASSENGER.getValue()) {
            keyPre = RedisKeyPrefixConstant.PASSENGER_LOGIN_CODE_KEY_PRE;
        } else if (identity == IdentityEnum.DRIVER.getValue()) {
            keyPre = RedisKeyPrefixConstant.DRIVER_LOGIN_CODE_KEY_PRE;
        }
        return keyPre;
    }

    /**
     * 判断此手机号发送时限限制
     *
     * @param phoneNumber
     * @return
     */
    private ResponseResult checkSendCodeTimeLimit(String phoneNumber) {
        // todo 判断是否有 限制1分钟，10分钟，24小时。

        return ResponseResult.success("");
    }

    /**
     * todo 三档验证校验
     *
     * @param phoneNumber
     * @param code
     * @return
     */
    private ResponseResult checkCodeThreeLimit(String phoneNumber, String code) {

        return ResponseResult.success("");
    }
}
