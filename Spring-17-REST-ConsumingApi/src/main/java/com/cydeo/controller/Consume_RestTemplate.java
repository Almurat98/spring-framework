package com.cydeo.controller;

import com.cydeo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/users")
@RestController

public class Consume_RestTemplate {


        private final String URI= "https://jsonplaceholder.typicode.com/users";
        private final RestTemplate restTemplate;


    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<List<User>> readAllUsers(){
    ResponseEntity<User[]>responseEntity= restTemplate.getForEntity(URI,User[].class);


     return ResponseEntity.ok(Arrays.asList(responseEntity.getBody()));
    }


    @GetMapping("{id}")
    public Object getUser(@PathVariable Integer id){
        String URL = URI+"/{id}";
        return  restTemplate.getForObject(URL,Object.class,id);
    }
}
