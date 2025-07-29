package com.studentapi.studentapi.controller;

import com.studentapi.studentapi.entity.Student;
import com.studentapi.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    public Student addStudent(@RequestBody Student student) {
        System.out.println("Received POST /students request");
        return service.createStudent(student);
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
        return service.getStudent(id);
    }


}

