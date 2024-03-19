package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Courses.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursesRep extends CrudRepository<Courses, Long> {
    Optional<Courses> findByName(String name);

    Optional<Courses> findTopByNameContainingIgnoreCase(String name);

    Optional<Courses> findTopByDescriptionContainingIgnoreCase(String description);
}
