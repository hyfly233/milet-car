package com.hyfly.milet.api.passenger.service.impl;

import com.hyfly.milet.api.passenger.service.ServicePassengerUserService;
import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.passenger.user.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicePassengerUserServiceImpl implements ServicePassengerUserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseResult login(String passengerPhone) {
        String url = "http://service-passenger-user/auth/login";

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassengerPhone(passengerPhone);
        ResponseResult result = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<Object>(loginRequest, null), ResponseResult.class).getBody();

        return result;
    }

}