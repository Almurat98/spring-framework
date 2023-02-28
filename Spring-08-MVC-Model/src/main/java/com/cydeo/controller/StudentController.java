package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int studentID= new Random().nextInt(5000);
        model.addAttribute("id",studentID);

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(0);
        numbers.add(6);

        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "/student/welcome";
    }
}