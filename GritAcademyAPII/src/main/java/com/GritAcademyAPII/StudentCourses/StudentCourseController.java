package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Courses.CoursesRep;
import com.GritAcademyAPII.Students.Students;
import com.GritAcademyAPII.Students.StudentsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student-courses")
public class StudentCourseController {

    private final StudentCoursesRep studentCourseRepository;
    private final StudentsRep studentsRepository;
    private final CoursesRep coursesRepository;

    @Autowired
    public StudentCourseController(StudentCoursesRep studentCoursesRep, StudentsRep studentsRep, CoursesRep coursesRep) {
        this.studentCourseRepository = studentCoursesRep;
        this.studentsRepository = studentsRep;
        this.coursesRepository = coursesRep;
    }

    @GetMapping
    public ResponseEntity<List<StudentCourses>> getAllStudentCourses() {
        List<StudentCourses> studentCourses = studentCourseRepository.findAll();
        return new ResponseEntity<>(studentCourses, HttpStatus.OK);
    }

    @GetMapping("/students/{studentsId}")
    public ResponseEntity<?> getStudentCourses(@PathVariable Long studentsId) {
        Optional<Students> studentOptional = studentsRepository.findById(studentsId);
        if (studentOptional.isPresent()) {
            List<StudentCourses> studentCourses = studentCourseRepository.findByStudentsId(studentsId);
            return new ResponseEntity<>(studentCourses, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/courses/{courseName}")
    public ResponseEntity<?> getCourseStudents(@PathVariable String courseName) {
        List<Courses> coursesList = coursesRepository.findByName(courseName);
        if (!coursesList.isEmpty()) {
            Courses course = coursesList.get(0);
            List<StudentCourses> courseStudents = studentCourseRepository.findByCoursesId(course.getId());
            return new ResponseEntity<>(courseStudents, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Course not found", HttpStatus.NOT_FOUND);
        }
    }
}
