package com.cydeo.model;

import com.cydeo.utils.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private int Age;
    private Gender gender;
}
