package com.example.springboot.service.impl;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.example.springboot.entity.Age;
import com.example.springboot.service.CalcAge;

@Service
public class CalcAgeImpl implements CalcAge
{

    @Override
    public Age calc(LocalDate brithDate)
    {
        Period period = Period.between(brithDate, LocalDate.now());

        return new Age(period.getDays(), period.getMonths(), period.getYears());
    }

}
