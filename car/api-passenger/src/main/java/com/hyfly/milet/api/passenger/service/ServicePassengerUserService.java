package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface ServicePassengerUserService {

    ResponseResult login(String passengerPhone);
}
