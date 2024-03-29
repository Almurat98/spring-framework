package com.cydeo.repository;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    List<Department>findByDepartment(String department);

    List<Department>findByDivisionIs(String division);

    List<Department>findDistinctTop3ByDivisionContainingIgnoreCase(String division);


    @Query("SELECT d FROM Department d where d.division IN ?1")
    List<Department>getDepartmentDivision(List<String> division);


    List<Employee>retrieveDepartmentByDivision(String division);














}
