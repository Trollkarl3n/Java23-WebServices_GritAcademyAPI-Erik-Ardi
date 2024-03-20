package com.GritAcademyAPII.StudentCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-courses")
public class StudentCourseController {

    private final StudentCoursesRep studentCourseRepository;

    @Autowired
    public StudentCourseController(StudentCoursesRep studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    @GetMapping
    public ResponseEntity<List<StudentCourses>> getAllStudentCourses() {
        List<StudentCourses> studentCourses = studentCourseRepository.findAll();
        return new ResponseEntity<>(studentCourses, HttpStatus.OK);
    }
}
