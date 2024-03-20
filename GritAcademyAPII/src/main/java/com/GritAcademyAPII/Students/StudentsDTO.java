package com.GritAcademyAPII.Students;

import com.GritAcademyAPII.Courses.CoursesDTO;
import lombok.Data;

import java.util.List;

@Data
public class StudentsDTO {
    private Long id;
    private String fName;
    private String lName;
    private String town;
    private List<CoursesDTO> courses;
}