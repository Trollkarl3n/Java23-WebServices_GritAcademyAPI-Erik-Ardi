package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.CoursesRep;
import com.GritAcademyAPII.StudentCourses.StudentCoursesRep;
import com.GritAcademyAPII.Students.StudentsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCoursesService {

    @Autowired
    StudentCoursesRep studentCoursesRep;

    @Autowired
    CoursesRep coursesRep;

    @Autowired
    StudentsRep studentsRep;
}
