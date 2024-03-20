package com.GritAcademyAPII.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    private final CoursesRep courseRepository;
    private final CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesRep courseRepository, CoursesService coursesService) {
        this.courseRepository = courseRepository;
        this.coursesService = coursesService;
    }

    @GetMapping
    public ResponseEntity<List<Courses>> getAllCourses() {
        List<Courses> courses = coursesService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        Courses course = courseRepository.findById(id).orElse(null);
        if (course != null) {
            return new ResponseEntity<>(course, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Course not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getCoursesByName(@PathVariable String name) {
        List<Courses> courses = courseRepository.findByName(name);
        if (!courses.isEmpty()) {
            return new ResponseEntity<>(courses, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Courses with the given name not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/name/contains/{keyword}")
    public ResponseEntity<?> getCoursesByNameContaining(@PathVariable String keyword) {
        List<Courses> courses = courseRepository.findByNameContaining(keyword);
        if (!courses.isEmpty()) {
            return new ResponseEntity<>(courses, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, No courses found with the given keyword in their name", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/description/contains/{keyword}")
    public ResponseEntity<?> getCoursesByDescriptionContaining(@PathVariable String keyword) {
        List<Courses> courses = courseRepository.findByDescriptionContaining(keyword);
        if (!courses.isEmpty()) {
            return new ResponseEntity<>(courses, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, No courses found with the given keyword in their description", HttpStatus.NOT_FOUND);
    }
}
