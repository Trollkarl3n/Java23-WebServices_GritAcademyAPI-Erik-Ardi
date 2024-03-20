package com.GritAcademyAPII.StudentCourses;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface StudentCoursesRep {
    List<StudentCourses> findAllByStudenIdId(Long id);

    List<StudentCourses> findAll();
}
