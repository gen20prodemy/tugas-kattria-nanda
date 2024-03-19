package com.example.gen20javaspringbootaritmatika.controller;

import com.example.gen20javaspringbootaritmatika.modul.Kurang;
import com.example.gen20javaspringbootaritmatika.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KurangController {
    private KurangService kurangService;

    @Autowired
    public KurangController (KurangService kurangService){
        this.kurangService = kurangService;
    }

    @PostMapping("/kurang")
    public int kurang (@RequestBody Kurang request){
        return kurangService.kurang(request.getNum1(), request.getNum2());
    }
}
