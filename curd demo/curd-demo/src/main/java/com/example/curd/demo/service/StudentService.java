package com.example.curd.demo.service;

import com.example.curd.demo.model.Student;

import java.util.List;

public interface StudentService {
    public  Integer saveStudent(Student student);

    public List<Student>getAllStudents();
    public Student getStudentByID(Integer sno);

    public String deleteStudent(Integer sno);

    String update(Integer sno, Student student);
}
