package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface ServiceSmsService {

     ResponseResult sendSms(String phoneNumber , String code);
}
