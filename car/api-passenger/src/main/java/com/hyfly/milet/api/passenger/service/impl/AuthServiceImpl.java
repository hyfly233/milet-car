package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.service.AuthService;
import com.hyfly.milet.api.passenger.service.ServicePassengerUserService;
import com.hyfly.milet.api.passenger.service.ServiceVerificationCodeService;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.enums.CommonStatusEnum;
import com.hyfly.milet.common.enums.IdentityEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hyfly
 */
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private ServiceVerificationCodeService serviceVerificationCodeService;

    @Autowired
    private ServicePassengerUserService servicePassengerUserService;

    /**
     * 校验
     *
     * @param passengerPhone passengerPhone
     * @param code           验证码
     * @return ResponseResult
     */
    @Override
    public ResponseResult auth(String passengerPhone, String code) {
        // 验证验证码：
        ResponseResult responseResult = serviceVerificationCodeService.verifyCode(IdentityEnum.PASSENGER.getValue(), passengerPhone, code);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
            return ResponseResult.fail("登录失败：验证码校验失败");
        }

        // 用户登录
        responseResult = servicePassengerUserService.login(passengerPhone);
        if (responseResult.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
            return ResponseResult.fail("登录失败：登录失败");
        }

        return responseResult;
    }

}
