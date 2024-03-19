package com.GritAcademyAPII.DTO;

import lombok.Data;

import java.util.List;

@Data
public class StudentsDTO {
    private Long id;
    private String fname;
    private String lname;
    private String town;
    private String hobby;
    List<CoursesDTO> courses;
}