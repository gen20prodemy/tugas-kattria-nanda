package com.example.gen20javaspringbootpos.Controller;

import com.example.gen20javaspringbootpos.ModelDto.ProdukDto;
import com.example.gen20javaspringbootpos.Service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api2")
public class ProdukController {

    private final ProdukService produkService;

    @Autowired
    public ProdukController (ProdukService produkService){
        this.produkService = produkService;
    }

    @PostMapping("/produk/add")
    public ResponseEntity <ProdukDto> addProduk (@RequestBody ProdukDto produkDto){
        ProdukDto saveProduk = produkService.addProduk(produkDto);
        return new ResponseEntity<>(saveProduk, HttpStatus.CREATED);
    }


    @GetMapping("/produk/get")
    public ResponseEntity <List<ProdukDto>> getAllProduk (){
       List<ProdukDto> produk = produkService.getAllProduk();
       return ResponseEntity.ok(produk);
    }


}
