package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Students.Students;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.net.ssl.SSLSession;

@Entity(name = "students_courses")
@Table(name = "students_courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentCourses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "students_id", referencedColumnName = "id")
    private Students students;


    @ManyToOne
    @JoinColumn(name = "courses_id", referencedColumnName = "id")
    private Courses courses;

}
