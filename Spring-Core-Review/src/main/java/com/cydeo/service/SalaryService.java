package com.cydeo.service;

import com.cydeo.model.Employee;
import com.cydeo.repository.DBEmployeeRepo;
import com.cydeo.repository.OvertimeHours;
import com.cydeo.repository.WeeklyHours;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {
   private final DBEmployeeRepo dbEmployeeRepo;
    private final WeeklyHours weeklyHours;
    private final OvertimeHours overtimeHours;


    public SalaryService(DBEmployeeRepo dbEmployeeRepo, WeeklyHours weeklyHours, OvertimeHours overtimeHours) {
        this.dbEmployeeRepo = dbEmployeeRepo;
        this.weeklyHours = weeklyHours;
        this.overtimeHours = overtimeHours;
    }

    public void calculateAnnualSalary(Employee employee){

        int Salary = employee.getHourlyRate()*(weeklyHours.getHours()+overtimeHours.getHours())*52;

        System.out.println(employee.getName()+"'s Annual Salary is "+Salary);
    }


}
