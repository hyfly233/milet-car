package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface VerificationCodeService {

    ResponseResult send(String phoneNumber);

    ResponseResult verify(String phoneNumber, String code);
}
