package com.example.curd.demo.repository;

import com.example.curd.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends CrudRepository<Student,Integer> {
    Student getBySno(Integer sno);
}
