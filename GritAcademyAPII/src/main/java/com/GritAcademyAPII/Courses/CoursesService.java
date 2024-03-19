package com.GritAcademyAPII.Courses;

import com.GritAcademyAPII.Courses.CoursesDTO;
import com.GritAcademyAPII.Courses.Courses;
import com.GritAcademyAPII.Courses.CoursesRep;
import com.GritAcademyAPII.Students.Students;
import com.GritAcademyAPII.Students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoursesService {
    @Autowired
    CoursesRep coursesRepository;

    public Iterable<Courses> getAllStudents(){
        return coursesRepository.findAll();
    }
    public Optional<Courses> getStudentById(int id){
        return coursesRepository.findById((long) id);
    }

    public List<CoursesDTO> getCoursesByStudentsId(int studentsID){

        return coursesRepository.findByStudentsId(studentsID).stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    /**
     * This method is needed to avoid circular querries
     * DTO map methods are used as a middle man between the querry result
     * and data return to client. This middle man makes t possible to have
     * a bigger control over what client sees and in what format
     * @param courses
     * @return
     */
    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setYHP(courses.getyhp());
        dto.setDescription(courses.getDescription());
        dto.setStudents(courses.getStudents().stream().map(this::mapToDTO).collect(Collectors.toList()));
        return dto;
    }
    /**
     * This method is needed to avoid circular querries
     * DTO map methods are used as a middle man between the querry result
     * and data return to client. This middle man makes t possible to have
     * a bigger control over what client sees and in what format
     * @param students
     * @return
     */
    private StudentsDTO mapToDTO(Students students){
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setEmail(students.getEmail());
        dto.setHobby(students.getHobby());
        dto.setPhone(students.getPhone());
        dto.setTown(students.getTown());
        dto.setFName(students.getFName());
        dto.setLName(students.getLName());
        dto.setPassword(students.getPassword());
        dto.setUsername(students.getUsername());
        return dto;
    }
}