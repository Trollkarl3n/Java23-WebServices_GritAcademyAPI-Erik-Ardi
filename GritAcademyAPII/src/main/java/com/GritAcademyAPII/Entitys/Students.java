package com.GritAcademyAPII.Entitys;

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


    @Column(name = "username")
    private String username;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;


    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "town")
    private String town;

    @Column(name = "hobby")
    private String hobby;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<StudentCourses> courses = new HashSet<>();
}
