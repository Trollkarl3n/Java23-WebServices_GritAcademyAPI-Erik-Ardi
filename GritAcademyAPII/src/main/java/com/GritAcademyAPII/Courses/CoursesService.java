package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Students.Students;
import com.GritAcademyAPII.Students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    CoursesRep coursesRepository;

    public List <Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setYhp(courses.getYhp());
        dto.setDescription(courses.getDescription());
        return dto;
    }

}