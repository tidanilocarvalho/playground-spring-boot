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
