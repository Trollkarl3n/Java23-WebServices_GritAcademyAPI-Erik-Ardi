package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.CoursesDTO;
import com.GritAcademyAPII.Students.StudentsDTO;
import lombok.Data;

@Data
public class StudentCoursesDTO {
    private Long id;
    private StudentsDTO studentsId;
    private CoursesDTO coursesId;
}
