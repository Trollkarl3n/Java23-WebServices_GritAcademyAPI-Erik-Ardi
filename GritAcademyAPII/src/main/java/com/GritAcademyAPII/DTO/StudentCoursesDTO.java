package com.GritAcademyAPII.DTO;

import lombok.Data;

@Data
public class StudentCoursesDTO {
    private Long id;
    StudentsDTO student;
    CoursesDTO course;
}
