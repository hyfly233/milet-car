package com.hyfly.milet.service.verification.code.controller;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.request.GenerateCodeRequest;
import com.hyfly.milet.common.dto.service.verification.code.request.VerifyCodeRequest;
import com.hyfly.milet.service.verification.code.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @param request request
     * @return ResponseResult
     */
    @GetMapping("/generate")
    public ResponseResult generate(GenerateCodeRequest request) {
        return verifyCodeService.generate(request.getIdentity(), request.getPhoneNumber());
    }

    /**
     * 验证校验码
     *
     * @param request request
     * @return ResponseResult
     */
    @PostMapping("/verify")
    public ResponseResult verify(@RequestBody VerifyCodeRequest request) {
        return verifyCodeService.verify(request.getIdentity(), request.getPhoneNumber(), request.getCode());
    }
}
