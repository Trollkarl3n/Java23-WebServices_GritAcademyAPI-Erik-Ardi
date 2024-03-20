package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Students.Students;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "student_courses")
@Table(name = "student_courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentCourses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "students_id", referencedColumnName = "id")
    Students studentsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courses_id", referencedColumnName = "id")
    Courses coursesId;
}
