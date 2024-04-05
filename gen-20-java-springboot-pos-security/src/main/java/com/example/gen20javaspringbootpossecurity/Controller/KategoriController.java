package com.example.gen20javaspringbootpossecurity.Controller;

import com.example.gen20javaspringbootpossecurity.ModelDto.KategoriDto;
import com.example.gen20javaspringbootpossecurity.ModelDto.ResponseDto;
import com.example.gen20javaspringbootpossecurity.Service.KategoriService;
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
@RequestMapping("/api2/kategori")
public class KategoriController {
    private final KategoriService kategoriService;

    @Autowired
    public KategoriController(KategoriService kategoriService) {
        this.kategoriService = kategoriService;
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto<KategoriDto>> addKategori (@Valid @RequestBody KategoriDto kategoriDto, Errors errors){
        ResponseDto<KategoriDto> response = new ResponseDto<>();

          if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                response.getMessages().add(error.getDefaultMessage());
            }
            response.setStatus(false);
            response.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
          response.setStatus(true);
          response.setMessages(Collections.singletonList("Kategori berhasil di tambahkan!"));
          response.setPayload(kategoriService.addKategori(kategoriDto));
          return ResponseEntity.ok(response);
    }
    @GetMapping("/get")
    public ResponseEntity <List<KategoriDto>> getAllKategori (){
        List<KategoriDto> kategori = kategoriService.getAllKategori();
        return ResponseEntity.ok(kategori);
    }


}
