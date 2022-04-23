package com.hyfly.milet.common.dto.service.verification.code.request;

import lombok.Data;

@Data
public class VerifyCodeRequest {

    private int identity;

    private String phoneNumber;

    private String code;
}