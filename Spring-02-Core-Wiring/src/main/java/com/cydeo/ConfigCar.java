package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c =new Car();
        c.setBrand("Ford");
    return c;
    }

   // Direct wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Alxat");
//        p.setCar(car());
//        return p;}

  //  autowiring
    @Bean
    Person person(Car car) {
        Person p = new Person();
        p.setName("Almurat");
        p.setCar(car);
        return p;
    }


}
