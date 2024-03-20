package com.GritAcademyAPII.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRep extends JpaRepository<Courses, Long> {
    List<Courses> findByName(String name);
    
    List<Courses> findByNameContaining(String keyword);

    List<Courses> findByDescriptionContaining(String keyword);
}
