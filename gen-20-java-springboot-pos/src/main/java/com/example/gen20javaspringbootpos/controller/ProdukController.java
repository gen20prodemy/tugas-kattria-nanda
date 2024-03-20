package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.Entity.Produk;
import com.example.gen20javaspringbootpos.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdukController {
    private ProdukService produkService;

    @Autowired
    public ProdukController (ProdukService produkService){
        this.produkService = produkService;
    }

    @GetMapping("/produk")
    public List<Produk> getAllData(){
        return  produkService.getAllData();
    }
}
