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
    private String hobby;
    private String email;
    private String phone;
    private String username;
    private String password;
    private List<CoursesDTO> courses;
}