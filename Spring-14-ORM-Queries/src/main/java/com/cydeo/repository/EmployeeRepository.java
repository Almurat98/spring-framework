package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Transient;
import javax.transaction.Transactional;
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
    List<Integer> getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e from Employee e where e.email=?1 and e.salary=?2")
    Employee getEmployeeDetail(String email,int salary);

    @Query("SELECT e FROM  Employee e WHERE e.salary <> ?1")
    List<Employee> getEmployeeSalaryNotEqual(int salary);

    @Query("SELECT e FROM Employee e where e.firstName like ?1")
    List<Employee>getEmployeeFirstNameLike(String pattern);

    @Query("SELECT e FROM  Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);


    @Query("SELECT e FROM Employee e where e.salary between ?1 and ?2")
    List<Employee>getEmployeeSalaryBetween(int s1,int s2);


    @Query("SELECT e FROM Employee e order by e.salary")
    List<Employee>getEmployeeSalaryAsc();


    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List<Employee>getEmployeeSalary(@Param("salary") int salary);

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.email ='admin@cydeo.com' WHERE e.id =:id")
    void updateEmployeeJPQL(@Param("id") int id);




}
