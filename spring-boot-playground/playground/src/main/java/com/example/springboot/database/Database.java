//**********************************************************************
// Copyright (c) 2020 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
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
