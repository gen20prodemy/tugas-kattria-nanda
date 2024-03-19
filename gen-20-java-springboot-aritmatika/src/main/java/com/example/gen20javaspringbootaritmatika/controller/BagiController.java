package com.example.gen20javaspringbootaritmatika.controller;

import com.example.gen20javaspringbootaritmatika.modul.Bagi;
import com.example.gen20javaspringbootaritmatika.service.BagiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BagiController {
    private BagiService bagiService;
    @Autowired
    public BagiController(BagiService bagiService){
        this.bagiService = bagiService;
    }

    @PostMapping("/bagi")
    public double bagi (@RequestBody Bagi request){
        return bagiService.bagi(request.getNum1(), request.getNum2());
    }
}
