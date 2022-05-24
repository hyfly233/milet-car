package com.hyfly.milet.service.verification.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Service Verification Code
 *
 * @author hyfly
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceVerificationCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceVerificationCodeApplication.class, args);
    }

}
