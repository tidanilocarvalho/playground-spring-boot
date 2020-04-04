package com.example.springboot.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.springboot.entity.Student;

public class Database
{
    private static final Database INSTANCE = new Database();

    private int index;
    private Map<Integer, Student> students = new HashMap<>();

    private Database() {}
    
    public static Database getIntance() {
        return INSTANCE;
    }
    
    public Student saveStudent(Student student) {
        students.put(student.getIndex(), student);
        return student;
    }

    public Student updateStudent(Student student) {
        students.put(student.getIndex(), student);
        return student;
    }

    public void deleteByIndex(int index) {
        students.remove(index);
    }
    
    public Student findByIndex(int index) {
        return students.get(index);
    }
    
    public Collection<Student> findAll() {
        return students.values();
    }
    
    public void deleteAll() {
        students.clear();
    }
    
    public int getIndex() {
        return ++index;
    }
    
}
