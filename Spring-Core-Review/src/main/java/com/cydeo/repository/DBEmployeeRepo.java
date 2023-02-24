package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepo implements EmployeeRepo{
    Employee employee;
    @Override
    public int getHourlyRate() {

        return employee.getHourlyRate();
    }
}
