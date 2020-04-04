package com.example.springboot.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student
{
    private int index;
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;
    private LocalDateTime dateRegister;
    private LocalDateTime lastUpdate;
    
    private Age age;

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getDateBirth()
    {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth)
    {
        this.dateBirth = dateBirth;
    }

    public LocalDateTime getDateRegister()
    {
        return dateRegister;
    }

    public void setDateRegister(LocalDateTime dateRegister)
    {
        this.dateRegister = dateRegister;
    }
    
    public LocalDateTime getLastUpdate()
    {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate)
    {
        this.lastUpdate = lastUpdate;
    }

    public Age getAge()
    {
        return age;
    }

    public void setAge(Age age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "Playground [firstName=" + firstName + ", lastName=" + lastName + ", dateBirth=" + dateBirth + ", dateRegister=" + dateRegister + "]";
    }
    
}
