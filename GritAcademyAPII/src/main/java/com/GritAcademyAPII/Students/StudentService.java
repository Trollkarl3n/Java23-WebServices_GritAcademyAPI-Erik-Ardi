package com.GritAcademyAPII.Students;

import com.GritAcademyAPII.Courses.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    StudentsRep studentsRepository;

    public List <Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    private StudentsDTO mapToDTO(Students students){
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setTown(students.getTown());
        dto.setFName(students.getFName());
        dto.setLName(students.getLName());
        return dto;
    }

}

