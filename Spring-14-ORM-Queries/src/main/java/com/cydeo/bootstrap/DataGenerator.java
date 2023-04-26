package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {


    private RegionRepository regionRepository;
    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    private CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository,DepartmentRepository departmentRepository,EmployeeRepository employeeRepository,CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository=employeeRepository;
        this.courseRepository=courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("------------REGION STARTS----------------");

        System.out.println("regions in Canada: "+regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContainingIgnoreCase("United"));
        System.out.println(regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println(regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------REGION ENDS----------------");


        System.out.println("--------------Department starts----------------");

        System.out.println(departmentRepository.findByDepartment("Furniture"));
        System.out.println(departmentRepository.findByDivisionIs("Home"));
        System.out.println(departmentRepository.findDistinctTop3ByDivisionContainingIgnoreCase("Hea"));
        System.out.println("--------------Department ends----------------");


        System.out.println("-----------------Employee starts--------------------");
        System.out.println(employeeRepository.findByEmail("amcnee1@google.es"));
        System.out.println(employeeRepository.findByFirstNameAndLastNameAndEmailNotNull("Annie","Denge"));
        System.out.println(employeeRepository.findByLastNameStartingWith("Al"));
        System.out.println(employeeRepository.findBySalaryGreaterThan(100000).size());
        System.out.println(employeeRepository.findBySalaryLessThanEqual(35000));
        System.out.println(employeeRepository.findBySalaryGreaterThanEqualOrderBySalaryDesc(160000));
        System.out.println(employeeRepository.findDistinctTop5BySalaryLessThan(50000));
        System.out.println(employeeRepository.findByEmailIsNull());
        System.out.println(employeeRepository.getEmployeeSalary());
        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println("-----------------Employee ends--------------------");
        System.out.println("-----------------Course starts--------------------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println( courseRepository.existsByName("String"));
        System.out.println( courseRepository.countByCategory("Spring"));
        courseRepository.findByNameStartingWith("S").forEach(System.out::println);
        System.out.println("-----------------Course ends--------------------");




    }
}
