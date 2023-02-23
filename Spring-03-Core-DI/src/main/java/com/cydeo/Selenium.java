package com.cydeo;

import org.springframework.stereotype.Component;

@Component
public class Selenium {
    OfficeHours officeHours;
    public void getTeachingHours(){
        System.out.println("Total teaching hours: "+(10+ officeHours.getOfficeHours()));
    }
}
