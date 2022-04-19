package com.hyfly.milet.service.verification.code.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface VerifyCodeService {

    ResponseResult generate(int identity, String phoneNumber);

    ResponseResult verify(int identity, String phoneNumber, String code);
}
