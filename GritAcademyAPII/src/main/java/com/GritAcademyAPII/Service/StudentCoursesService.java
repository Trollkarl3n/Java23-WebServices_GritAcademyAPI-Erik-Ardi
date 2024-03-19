package com.GritAcademyAPII.Service;

import com.GritAcademyAPII.Repos.CoursesRep;
import com.GritAcademyAPII.Repos.StudentCoursesRep;
import com.GritAcademyAPII.Repos.StudentsRep;
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
