package com.example.gen20javaspringbootposshceduler.RajaOngkir.Controller;

import com.example.gen20javaspringbootposshceduler.RajaOngkir.Dto.OngkirRequestDto;
import com.example.gen20javaspringbootposshceduler.RajaOngkir.Service.OngkirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OngkirController {
    @Autowired
    private final OngkirService service;

    public OngkirController(OngkirService service) {
        this.service = service;
    }

    @PostMapping("/cost")
    public String getCost (@RequestBody OngkirRequestDto requestDto){
        return service.getOngkir(requestDto);
    }

}
