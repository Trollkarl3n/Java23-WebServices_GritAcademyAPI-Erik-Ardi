package com.GritAcademyAPII.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentsRep studentRepository;

    @Autowired
    public StudentController(StudentsRep studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public ResponseEntity<List<Students>> getAllStudents() {
        List<Students> students = studentRepository.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")    // Hej
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        Students student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Student not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/fname/{fName}")
    public ResponseEntity<?> getStudentsByFirstName(@PathVariable String fName) {
        List<Students> students = studentRepository.findByfName(fName);
        if (!students.isEmpty()) {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Students with the given first name not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/lname/{lName}")
    public ResponseEntity<?> getStudentsByLastName(@PathVariable String lName) {
        List<Students> students = studentRepository.findBylName(lName);
        if (!students.isEmpty()) {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Students with the given last name not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/town/{town}")
    public ResponseEntity<?> getStudentsByTown(@PathVariable String town) {
        List<Students> students = studentRepository.findByTown(town);
        if (!students.isEmpty()) {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
        return new ResponseEntity<>("404, Students from the given town not found", HttpStatus.NOT_FOUND);
    }
}
