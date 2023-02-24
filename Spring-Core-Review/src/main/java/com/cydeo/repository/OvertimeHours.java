package com.cydeo.repository;

import org.springframework.stereotype.Component;

@Component
public class OvertimeHours implements HourRepo{
    @Override
    public int getHours() {
        return 15;
    }
}
