package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO>getAllCourses(){
    List<CourseDTO> list = courseService.getCourses();
    return list;
}


    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long userId){
        return courseService.getCourseById(userId);
    }

    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable String name) {
        return courseService.getCoursesByCategory(name);
    }
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO){
        return courseService.createCourse(courseDTO);
    }
    @PutMapping("{id}")
    public void updateCourse(@PathVariable Long id,@RequestBody CourseDTO courseDTO){
    courseService.updateCourse(id,courseDTO);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable ("id") Long courseId){
        courseService.deleteCourseById(courseId);
    }





































}
