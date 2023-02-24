package com.cydeo;

import com.cydeo.config.ConfigAPP;
import com.cydeo.model.Employee;
import com.cydeo.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Oreo");
        employee1.setDepartment("Emotional Support");
        employee1.setHourlyRate(15);
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigAPP.class);

        SalaryService salaryService= container.getBean(SalaryService.class);

        salaryService.calculateAnnualSalary(employee1);
    }
}
