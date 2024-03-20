package com.GritAcademyAPII.StudentCourses;

import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Students.Students;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "studentcourses")
@Table(name = "studentcourses")
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
    Students students;

    @ManyToOne(fetch = FetchType.LAZY)
    Courses courses;
}
