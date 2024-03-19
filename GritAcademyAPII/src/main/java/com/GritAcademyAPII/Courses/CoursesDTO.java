package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Students.StudentsDTO;
import lombok.Data;

import java.util.List;

@Data
public class CoursesDTO {

    private Integer id;
    private String name;
    private String YHP;
    private String description;
    private List<StudentsDTO> students;
}