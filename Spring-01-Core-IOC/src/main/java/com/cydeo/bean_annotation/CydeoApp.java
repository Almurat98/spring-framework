package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container= new AnnotationConfigApplicationContext(ConfigApp.class);

        FullTimeMentor ft= container.getBean(FullTimeMentor.class);

        ft.createAccount();

    }
}
