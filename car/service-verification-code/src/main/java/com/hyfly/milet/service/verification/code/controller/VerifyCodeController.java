package com.hyfly.milet.service.verification.code.controller;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.VerifyCodeResponse;
import com.hyfly.milet.service.verification.code.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Autowired
    VerifyCodeService verifyCodeService;

    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        return verifyCodeService.generate(identity, phoneNumber);
    }
}
