package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.feign.FeignVerificationCodeService;
import com.hyfly.milet.api.passenger.service.ServiceVerificationCodeService;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.request.GenerateCodeRequest;
import com.hyfly.milet.common.dto.service.verification.code.request.VerifyCodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceVerificationCodeServiceImpl implements ServiceVerificationCodeService {

    @Autowired
    private FeignVerificationCodeService feignVerificationCodeService;

    @Override
    public ResponseResult generatorCode(int identity, String phoneNumber) {
        GenerateCodeRequest request = new GenerateCodeRequest();
        request.setIdentity(identity);
        request.setPhoneNumber(phoneNumber);

        return feignVerificationCodeService.generate(request);
    }

    @Override
    public ResponseResult verifyCode(int identity, String phoneNumber, String code) {
        VerifyCodeRequest request = new VerifyCodeRequest();
        request.setCode(code);
        request.setIdentity(identity);
        request.setPhoneNumber(phoneNumber);

        return feignVerificationCodeService.verify(request);
    }
}