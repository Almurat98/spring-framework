package com.cydeo.contoller;

import com.cydeo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    StudentService studentService;

    @Test
    void getStudent() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/student").accept(MediaType.APPLICATION_JSON))
              .andExpect(status().isOk())
              .andExpect(content().json("{\"id\": 0,\"firstName\":  \"Mike\",\"lastName\":  \"Smith\",\"age\":  20}"))
              .andReturn();

    }


}