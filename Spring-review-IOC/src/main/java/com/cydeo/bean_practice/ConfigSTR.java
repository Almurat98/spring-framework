package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigSTR {

    @Bean(name = "welcome")
    String str(){
        return "Welcome to Cydeo App";
    }
    @Bean(name = "Spring")
    String str2(){
        return "Spring Core Practice";
    }
}
