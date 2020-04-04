package com.example.springboot.service;

import java.util.Collection;

import com.example.springboot.entity.Student;

public interface StudentService
{
    Collection<Student> findAll();
    Student save(Student student);
    Student update(Student student);
    Student findByIndex(int index);
    void deleteByIndex(int index);
    void deleteAll();
}
