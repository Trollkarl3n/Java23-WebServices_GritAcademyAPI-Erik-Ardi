package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Courses.CoursesDTO;
import com.GritAcademyAPII.Students.Students;
import com.GritAcademyAPII.Students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentCoursesService {
     /*

    @Autowired
    StudentCoursesRep studentCoursesRepository;
    public List<StudentCoursesDTO> getAllStudentCourses() {
        return studentCoursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentCoursesDTO mapToDTO(StudentCourses studentCourses) {
        StudentCoursesDTO dto = new StudentCoursesDTO();
        dto.setId(studentCourses.getId());
        dto.setStudentsId(mapToDTO(studentCourses.getStudentsId()));
        dto.setCoursesId(mapToDTO(studentCourses.getCoursesId()));
        return dto;
    }

    private StudentsDTO mapToDTO(Students students){
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setTown(students.getTown());
        dto.setFName(students.getFName());
        dto.setLName(students.getLName());
        return dto;
    }

    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setYhp(courses.getYhp());
        dto.setDescription(courses.getDescription());
        return dto;
    }

      */
}
