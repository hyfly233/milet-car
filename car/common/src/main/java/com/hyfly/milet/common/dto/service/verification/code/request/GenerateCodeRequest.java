package com.hyfly.milet.common.dto.service.verification.code.request;

import lombok.Data;

@Data
public class GenerateCodeRequest {

    private int identity;

    private String phoneNumber;
}