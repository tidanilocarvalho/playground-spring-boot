package com.example.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.example.springboot.service.Calc;

@Service
public class CalcImpl implements Calc
{

    @Override
    public double sum(double a, double b)
    {
        return a + b;
    }

}
