package com.online.taxi.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hyfly
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceWalletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceWalletApplication.class, args);
    }

}
