package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirstNameAndLastNameAndEmailNotNull(String firstName,String lastName);

    List<Employee> findByFirstNameIsNot(String firstName);

    List<Employee> findByLastNameStartingWith(String lastName);

    List<Employee>findBySalaryGreaterThan(Integer salary);
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    List<Employee>findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    List<Employee>findDistinctTop5BySalaryLessThan(Integer salary);

    List<Employee>findByEmailIsNull();
}
