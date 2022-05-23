package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface ServiceVerificationCodeService {

    ResponseResult generatorCode(int identity, String phoneNumber);

    ResponseResult verifyCode(int identity, String phoneNumber, String code);
}