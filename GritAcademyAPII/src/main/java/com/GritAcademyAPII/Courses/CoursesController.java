package com.GritAcademyAPII.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    CoursesService coursesService;
    @GetMapping("/courses")
    public List <Courses> getAllCourse(){
        return coursesService.getAllCourses();
    }
}
