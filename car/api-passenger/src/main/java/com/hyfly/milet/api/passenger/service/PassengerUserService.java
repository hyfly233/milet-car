package com.hyfly.milet.api.passenger.service;

import com.hyfly.milet.common.dto.ResponseResult;

public interface PassengerUserService {

    ResponseResult login(String passengerPhone);

    ResponseResult logout(String token);
}
