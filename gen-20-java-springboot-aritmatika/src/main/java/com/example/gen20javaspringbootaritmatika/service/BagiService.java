package com.example.gen20javaspringbootaritmatika.service;

import org.springframework.stereotype.Service;

@Service
public class BagiService {
    public double bagi (double num1, double num2){
        if (num2==0){
            throw new IllegalArgumentException("Num2 tidak boleh nol");
        }
        return num1/num2;
    }
}
