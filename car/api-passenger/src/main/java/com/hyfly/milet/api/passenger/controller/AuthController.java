package com.hyfly.milet.api.passenger.controller;

import com.hyfly.milet.api.passenger.req.UserAuthRequest;
import com.hyfly.milet.api.passenger.service.AuthService;
import com.hyfly.milet.common.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyfly
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody @Validated UserAuthRequest userAuthRequest) {
        return authService.auth(userAuthRequest.getPassengerPhone(), userAuthRequest.getCode());

    }
}