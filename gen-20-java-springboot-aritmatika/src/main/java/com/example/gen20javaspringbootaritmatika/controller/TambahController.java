package com.example.gen20javaspringbootaritmatika.controller;

import com.example.gen20javaspringbootaritmatika.modul.Tambah;
import com.example.gen20javaspringbootaritmatika.service.TambahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TambahController {
    private final TambahService tambahService;

    @Autowired
    public TambahController (TambahService tambahService){
        this.tambahService = tambahService;
    }

    @PostMapping("/tambah")
    public int tambah (@RequestBody Tambah request){
        return tambahService.tambah(request.getNum1(), request.getNum2());
    }
}
