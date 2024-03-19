package com.GritAcademyAPII.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRep extends CrudRepository<Students, Long> {
    List<Students> findAllbyName(String fname);
}
