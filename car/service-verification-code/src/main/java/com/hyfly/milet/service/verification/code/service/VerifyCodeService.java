package com.hyfly.milet.service.verification.code.service;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.VerifyCodeResponse;

public interface VerifyCodeService {

    ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber);

    ResponseResult<VerifyCodeResponse> verify(int identity, String phoneNumber, String code);
}
