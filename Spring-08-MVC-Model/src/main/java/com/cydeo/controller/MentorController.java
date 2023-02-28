package com.cydeo.controller;

import com.cydeo.model.Mentor;
import com.cydeo.utils.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MentorController {

            @RequestMapping("/mentor")
            public String mentor(Model model){
                ArrayList<Mentor> mentorsList = new ArrayList<>();
                mentorsList.add(new Mentor("Mike","Smith",45, Gender.Male));
                mentorsList.add(new Mentor("Tom","Hanks",65, Gender.Male));
                mentorsList.add(new Mentor("Amy","Bryan",25, Gender.Female));
                mentorsList.add(new Mentor("Oreo","Almurat",2, Gender.Male));

                model.addAttribute("mentors",mentorsList);

            return "mentor";
        }



}
