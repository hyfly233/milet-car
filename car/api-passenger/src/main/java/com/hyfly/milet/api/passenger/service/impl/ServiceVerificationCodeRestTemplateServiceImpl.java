package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.service.ServiceVerificationCodeRestTemplateService;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.request.VerifyCodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceVerificationCodeRestTemplateServiceImpl implements ServiceVerificationCodeRestTemplateService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseResult generatorCode(int identity, String phoneNumber) {

        String url = "http://service-verification-code/verify-code/generate/" + identity + "/" + phoneNumber;

        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(null, null), ResponseResult.class).getBody();
    }

    @Override
    public ResponseResult verifyCode(int identity, String phoneNumber, String code) {

        String url = "http://service-verification-code/verify-code/verify/";

        VerifyCodeRequest request = new VerifyCodeRequest();
        request.setCode(code);
        request.setIdentity(identity);
        request.setPhoneNumber(phoneNumber);

        return restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(request, null), ResponseResult.class).getBody();
    }
}