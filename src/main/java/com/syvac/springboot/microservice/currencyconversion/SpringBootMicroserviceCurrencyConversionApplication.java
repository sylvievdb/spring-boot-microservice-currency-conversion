package com.syvac.springboot.microservice.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.syvac.springboot.microservice.currencyconversion")
public class SpringBootMicroserviceCurrencyConversionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
    }
}
