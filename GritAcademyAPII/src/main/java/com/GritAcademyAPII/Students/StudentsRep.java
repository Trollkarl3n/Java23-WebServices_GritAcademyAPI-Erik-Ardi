package com.GritAcademyAPII.Students;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRep extends CrudRepository<Students, Long> {
    List<Students> findAllByFname(String fName);

    List<Students> findAllByLname(String lName);

    List<Students> findAllByTown(String town);
}
