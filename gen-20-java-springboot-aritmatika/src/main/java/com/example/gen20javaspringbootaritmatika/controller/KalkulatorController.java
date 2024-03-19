package com.example.gen20javaspringbootaritmatika.controller;

import com.example.gen20javaspringbootaritmatika.modul.Kalkulator;
import com.example.gen20javaspringbootaritmatika.service.KalkulatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kalkulator")
public class KalkulatorController {

    private final KalkulatorService kalkulatorService;
    @Autowired
    public KalkulatorController(KalkulatorService kalkulatorService){
        this.kalkulatorService = kalkulatorService;
    }
    @PostMapping("/tambah")
    public double tambah (@RequestBody Kalkulator request){
        return kalkulatorService.tambah(request.getNum1(), request.getNum2());
    }

    @PostMapping("/kurang")
    public double kurang (@RequestBody Kalkulator request){
        return kalkulatorService.kurang(request.getNum1(), request.getNum2());
    }

    @PostMapping("/kali")
    public double kali (@RequestBody Kalkulator request){
        return kalkulatorService.kali(request.getNum1(), request.getNum2());
    }

    @PostMapping("/bagi")
    public double bagi (@RequestBody Kalkulator request){
        return kalkulatorService.bagi(request.getNum1(), request.getNum2());
    }


}
