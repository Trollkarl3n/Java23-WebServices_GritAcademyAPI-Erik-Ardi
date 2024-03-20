package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
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
    public List<StudentCoursesDTO> getAllStudentCoursesId(Long id) {
        return studentCoursesRepository.findAllByStudenIdId(id).stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentCoursesDTO mapToDTO(Courses studentCourses) {
        StudentCoursesDTO dto = new StudentCoursesDTO();
        dto.setId(studentCourses.getId());
        dto.setStudentsId(mapToDTO(studentCourses.getStudenstId()));
        dto.getCoursesId(mapToDTO(studentCourses.getCoursesId()));
        return dto;
    }

      */
}
