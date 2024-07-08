package com.iamrishavdas.SpringJDBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamrishavdas.SpringJDBC.Model.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
