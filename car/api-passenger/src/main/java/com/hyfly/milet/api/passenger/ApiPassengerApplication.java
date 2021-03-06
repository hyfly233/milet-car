package com.hyfly.milet.api.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * ApiPassengerApplication
 *
 * @author hyfly
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hyfly.milet.api.passenger.feign")
public class ApiPassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPassengerApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("api-passenger-test");
        return "api-passenger";
    }
}
