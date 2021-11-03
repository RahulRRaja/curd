package com.example.curd.demo.service;

import com.example.curd.demo.model.Student;
import com.example.curd.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public class StudentServiceImpl implements StudentService{
    @Autowired
    private Studentrepository repository;

    @Override
    public Integer saveStudent(Student student) {
        return repository.save(student).getSno();
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student getStudentByID(Integer sno) {
        return repository.findById(sno).get();
    }

    @Override
    public  String update(Integer sno, Student student){

        Student stdFromDb = repository.getBySno(sno);
        stdFromDb.setStdName(student.getStdName());
        stdFromDb.setStdClass(student.getStdClass());
        stdFromDb.setSchool(student.getSchool());

        repository.save(stdFromDb);
        return "successfully updated";
    }

    @Override
    public String deleteStudent(Integer sno) {
        repository.deleteById(sno);
        return "successfully deleted";
    }
}
