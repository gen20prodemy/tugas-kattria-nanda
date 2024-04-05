package com.example.gen20javaspringbootposredis.Controller;

import com.example.gen20javaspringbootposredis.ModelDto.ProdukDto;
import com.example.gen20javaspringbootposredis.ModelDto.ResponseDto;
import com.example.gen20javaspringbootposredis.Service.ProdukService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api2/produk")
public class ProdukController {
    private final ProdukService produkService;
    @Autowired
    public ProdukController (ProdukService produkService){
        this.produkService = produkService;
    }

    @PostMapping("/add")
    public ResponseEntity <ResponseDto<ProdukDto>> addProduk (@Valid @RequestBody ProdukDto produkDto, Errors errors){
        ResponseDto<ProdukDto> response = new ResponseDto<>();
        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                response.getMessages().add(error.getDefaultMessage());
            }
            response.setStatus(false);
            response.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        response.setStatus(true);
        response.setMessages(Collections.singletonList("Produk berhasil ditambahkan!"));
        response.setPayload(produkService.addProduk(produkDto));
        return ResponseEntity.ok(response);
    }
    @GetMapping("/get")
   // @Scheduled(cron = "* 10 * * * *")
    public ResponseEntity <List<ProdukDto>> getAllProduk (){
       List<ProdukDto> produk = produkService.getAllProduk();
       return ResponseEntity.ok(produk);
    }


}
