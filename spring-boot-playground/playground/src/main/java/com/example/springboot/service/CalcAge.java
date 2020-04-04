package com.example.springboot.service;

import java.time.LocalDate;

import com.example.springboot.entity.Age;

public interface CalcAge
{

    Age calc(LocalDate localDate);
    
}
