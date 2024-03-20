package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Students.Students;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    Set<Students> students = new HashSet<>();
}
