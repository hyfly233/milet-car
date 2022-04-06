package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface AuthService {
    ResponseResult auth(String passengerPhone, String code);
}
