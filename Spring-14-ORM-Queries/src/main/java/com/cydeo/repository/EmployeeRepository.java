package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    @Query("SELECT e FROM Employee e WHERE e.email='wfourcade4h@uiuc.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary from Employee e")
    Integer getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e from Employee e where e.email=?1 and e.salary=?2")
    Employee getEmployeeDetail(String email,int salary);
}
