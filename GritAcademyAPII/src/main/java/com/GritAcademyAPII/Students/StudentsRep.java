package com.GritAcademyAPII.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRep extends JpaRepository<Students, Long> {
    //List<Students> findByCourseId(int coursesID);
}
