package com.GritAcademyAPII.Students;

import com.GritAcademyAPII.Courses.Courses;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "students")
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    @Column(name = "town")
    private String town;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Courses> courses = new HashSet<>();
}