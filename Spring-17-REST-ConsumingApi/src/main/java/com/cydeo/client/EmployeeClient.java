package com.cydeo.client;

import com.cydeo.dto.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://dummyapi.io/",name = "EmployeeClient")
public interface EmployeeClient {

    @GetMapping("/data/v1/users?limit=10")
    Employee getEmoloyee();
}
