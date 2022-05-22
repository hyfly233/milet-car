package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

/**
 * @author hyfly
 */
public interface AuthService {
    /**
     * 校验
     *
     * @param passengerPhone passengerPhone
     * @param code           验证码
     * @return ResponseResult
     */
    ResponseResult auth(String passengerPhone, String code);
}
