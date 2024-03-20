package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Courses.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoursesRep extends JpaRepository<Courses, Long> {
    List<Courses> findByName(String name);
    
    List<Courses> findByNameContaining(String keyword);

    List<Courses> findByDescriptionContaining(String keyword);
}
