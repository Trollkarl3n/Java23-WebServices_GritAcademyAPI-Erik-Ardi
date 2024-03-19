package com.GritAcademyAPII.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    StudentsRep studentsRepository;

    //public List<StudentsDTO> getAllStudents(){
       // return studentsRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    //}

    //public Optional<Students> getStudentById(Long id){
        //return studentsRepository.findById(id);
    }

