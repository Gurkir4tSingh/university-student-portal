package com.studentapi.studentapi.service;

import com.studentapi.studentapi.entity.Student;
import com.studentapi.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Optional<Student> getStudent(Long id) {
        return repository.findById(id);
    }
}
