package com.hyfly.milet.service.verification.code.service.impl;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.VerifyCodeResponse;
import com.hyfly.milet.service.verification.code.service.VerifyCodeService;

public class VerifyCodeServiceImpl implements VerifyCodeService {

    /**
     * 生成6位验证码
     * 需要三档验证 不能无限制发短信 redis 1分钟3次后5分钟不能发 1小时10次 24小时不能发
     *
     * @param identity
     * @param phoneNumber
     * @return
     */
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        // 生成6位验证码
        String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));
        VerifyCodeResponse data = new VerifyCodeResponse();
        data.setCode(code);
        return ResponseResult.success(data);
    }

    @Override
    public ResponseResult<VerifyCodeResponse> verify(int identity, String phoneNumber, String code) {
        // TODO: 2022/3/31 校验验证码
        return null;
    }


}
