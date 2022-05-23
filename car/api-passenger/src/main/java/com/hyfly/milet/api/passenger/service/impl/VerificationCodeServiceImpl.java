package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.service.ServiceSmsService;
import com.hyfly.milet.api.passenger.service.ServiceVerificationCodeService;
import com.hyfly.milet.api.passenger.service.VerificationCodeService;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.VerifyCodeResponse;
import com.hyfly.milet.common.enums.CommonStatusEnum;
import com.hyfly.milet.common.enums.IdentityEnum;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeServiceImpl implements VerificationCodeService {

    @Autowired
    private ServiceVerificationCodeService serviceVerificationCodeService;

    @Autowired
    private ServiceSmsService serviceSmsService;

    @Override
    public ResponseResult send(String phoneNumber) {

        // 获取验证码
        ResponseResult responseResult = serviceVerificationCodeService.generatorCode(IdentityEnum.PASSENGER.getValue(), phoneNumber);
        VerifyCodeResponse verifyCodeResponse = null;
        if (responseResult.getCode() == CommonStatusEnum.SUCCESS.getCode()) {
            JSONObject data = JSONObject.fromObject(responseResult.getData().toString());
            verifyCodeResponse = (VerifyCodeResponse) JSONObject.toBean(data, VerifyCodeResponse.class);

        } else {
            return ResponseResult.fail("获取验证码失败");
        }

        String code = verifyCodeResponse.getCode();

        ResponseResult result = serviceSmsService.sendSms(phoneNumber, code);
        if (result.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
            return ResponseResult.fail("发送短信 失败");
        }

        return ResponseResult.success("");

    }

    @Override
    public ResponseResult verify(String phoneNumber, String code) {

        return serviceVerificationCodeService.verifyCode(IdentityEnum.PASSENGER.getValue(), phoneNumber, code);
    }

}