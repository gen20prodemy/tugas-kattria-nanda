package com.example.gen20javaspringbootaritmatika.controller;

import com.example.gen20javaspringbootaritmatika.modul.Kali;
import com.example.gen20javaspringbootaritmatika.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KaliController {
    private KaliService kaliService;

    @Autowired
    public KaliController(KaliService kaliService){
        this.kaliService = kaliService;
    }

    @PostMapping("/kali")
    public double kali (@RequestBody Kali request){
        return kaliService.kali(request.getNum1(), request.getNum2());
    }
}
