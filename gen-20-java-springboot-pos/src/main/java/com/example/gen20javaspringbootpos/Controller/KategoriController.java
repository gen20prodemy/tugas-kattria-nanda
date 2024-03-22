package com.example.gen20javaspringbootpos.Controller;

import com.example.gen20javaspringbootpos.ModelDto.KategoriDto;
import com.example.gen20javaspringbootpos.Service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class KategoriController {


    private final KategoriService kategoriService;

    @Autowired
    public KategoriController(KategoriService kategoriService) {
        this.kategoriService = kategoriService;
    }

    @PostMapping("/kategori/add")
    public ResponseEntity<KategoriDto> addKategori (@RequestBody KategoriDto kategoriDto){
        KategoriDto saveKategori = kategoriService.addKategori(kategoriDto);
        return new ResponseEntity<>(saveKategori, HttpStatus.CREATED);
    }
}
