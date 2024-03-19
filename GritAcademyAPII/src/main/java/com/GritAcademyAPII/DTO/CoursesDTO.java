package com.GritAcademyAPII.DTO;

import java.util.List;

public class CoursesDTO {
    private Long id;
    private String name;
    private String description;
    private Integer yhp;
    List<StudentsDTO> students;
}
