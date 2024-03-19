package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Students.StudentsDTO;
import lombok.Data;

import java.util.List;

@Data
public class CoursesDTO {

    private Long id;
    private String name;
    private String yhp;
    private String description;
    private List<StudentsDTO> students;
}