package com.studentapi.studentapi.repository;

import com.studentapi.studentapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
