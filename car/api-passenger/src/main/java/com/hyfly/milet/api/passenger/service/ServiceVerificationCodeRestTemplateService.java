package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface ServiceVerificationCodeRestTemplateService {

    ResponseResult generatorCode(int identity, String phoneNumber);

    ResponseResult verifyCode(int identity, String phoneNumber, String code);
}