package com.cydeo.model;

import com.cydeo.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String batch;
    private boolean isGraduated;
    private String Company;


}
