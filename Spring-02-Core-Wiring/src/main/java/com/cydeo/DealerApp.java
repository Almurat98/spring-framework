package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c1= container.getBean(Car.class);
        Person p = container.getBean(Person.class);

        System.out.println("Person's name : "+ p.getName());
        System.out.println("Car's brand :"+c1.getBrand());
        System.out.println("Person's Car: "+p.getCar().getBrand());
    }
}
