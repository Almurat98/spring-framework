package com.cydeo.repository;

import org.springframework.stereotype.Component;

@Component
public class WeeklyHours implements HourRepo{

    @Override
    public int getHours() {
        return 40;
    }
}
