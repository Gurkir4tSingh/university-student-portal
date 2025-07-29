package com.studentapi.studentapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String course;

}
