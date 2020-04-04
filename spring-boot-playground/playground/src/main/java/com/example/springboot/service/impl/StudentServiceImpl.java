package com.example.springboot.service.impl;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.database.Database;
import com.example.springboot.entity.Age;
import com.example.springboot.entity.Student;
import com.example.springboot.service.CalcAge;
import com.example.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{

    @Autowired
    private CalcAge calcAge;
    
    @Override
    public Collection<Student> findAll()
    {
        return Database.getIntance().findAll();
    }

    @Override
    public Student save(Student student)
    {
        int index = Database.getIntance().getIndex();
        Age age = calcAge.calc(student.getDateBirth());
        
        student.setAge(age);
        student.setIndex(index);
        student.setDateRegister(LocalDateTime.now());

        return Database.getIntance().saveStudent(student);
    }

    @Override
    public Student update(Student student)
    {
        Age age = calcAge.calc(student.getDateBirth());
        
        student.setAge(age);
        student.setLastUpdate(LocalDateTime.now());

        return Database.getIntance().updateStudent(student);
    }
    
    @Override
    public Student findByIndex(int index)
    {
        return Database.getIntance().findByIndex(index);
    }

    @Override
    public void deleteByIndex(int index)
    {
        Database.getIntance().deleteByIndex(index);
    }

    @Override
    public void deleteAll()
    {
        Database.getIntance().deleteAll();
    }

}
