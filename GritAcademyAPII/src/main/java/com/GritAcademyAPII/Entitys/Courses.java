package com.GritAcademyAPII.Entitys;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "courses")
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Courses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Nullable
    @Column(name = "description")
    private  String description;

    @Column(name = "yhp")
    private Integer yhp;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private Set<StudentCourses> students = new HashSet<>();
}