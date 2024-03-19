package com.example.gen20javaspringbootaritmatika.service;

import org.springframework.stereotype.Service;

@Service
public class KalkulatorService {

    public double tambah (double num1, double num2){
        return num1 + num2;
    }

    public double kurang (double num1, double num2){
        return num1 - num2;
    }

    public double kali (double num1, double num2){
        return num1 * num2;
    }

    public double bagi (double num1, double num2){
        if (num2==0){
            throw new IllegalArgumentException("tidak boleh nol");
        } return num1/num2;
    }
}
