package com.cydeo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class Consume_FeignClient {

    public static void main(String[] args) {

    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
