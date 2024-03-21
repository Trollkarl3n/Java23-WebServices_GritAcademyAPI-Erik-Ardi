package com.GritAcademyAPII.StudentCourses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface StudentCoursesRep extends JpaRepository<StudentCourses, Long> {
    List<StudentCourses> findByStudentsId(Long studentsId);
    List<StudentCourses> findByCoursesId(Long courseId);

}