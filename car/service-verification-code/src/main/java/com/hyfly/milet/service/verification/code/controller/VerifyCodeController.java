package com.hyfly.milet.service.verification.code.controller;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.service.verification.code.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码 controller
 *
 * @author hyfly
 */
@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Autowired
    VerifyCodeService verifyCodeService;

    /**
     * 生成校验码
     *
     * @param identity    identity {@link com.hyfly.milet.common.enums.IdentityEnum}
     * @param phoneNumber phoneNumber
     * @return ResponseResult
     */
    @GetMapping("/generate")
    public ResponseResult generate(int identity, String phoneNumber) {
        return verifyCodeService.generate(identity, phoneNumber);
    }
}
