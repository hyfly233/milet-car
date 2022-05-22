package com.hyfly.milet.service.verification.code.service;

import com.hyfly.milet.common.dto.ResponseResult;

/**
 * 验证码 Service
 *
 * @author hyfly
 */
public interface VerifyCodeService {

    /**
     * 生成校验码
     *
     * @param identity    identity
     * @param phoneNumber phoneNumber
     * @return ResponseResult
     */
    ResponseResult generate(int identity, String phoneNumber);

    /**
     * 验证校验码
     *
     * @param identity    identity
     * @param phoneNumber phoneNumber
     * @param code        校验码
     * @return ResponseResult
     */
    ResponseResult verify(int identity, String phoneNumber, String code);
}
