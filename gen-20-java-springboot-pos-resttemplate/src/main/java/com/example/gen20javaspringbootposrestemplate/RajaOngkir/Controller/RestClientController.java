package com.example.gen20javaspringbootposrestemplate.RajaOngkir.Controller;

import com.example.gen20javaspringbootposrestemplate.RajaOngkir.Dto.ProvinceDto;
import com.example.gen20javaspringbootposrestemplate.RajaOngkir.Service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestClientController {
    @Autowired
    private final RestClientService service;

    public RestClientController(RestClientService service) {
        this.service = service;
    }

    @GetMapping("/provinces")
  //  @Scheduled(cron = "30 * * * * *")
    public ProvinceDto[] getProvinces() throws Exception {
     //   System.out.println("hello");
     //   System.out.println(service.getAllProvince());
        return service.getAllProvince();
    }
    @GetMapping("/provinces/{id}")
    public ResponseEntity<String> getProvincesId(@PathVariable int id) throws Exception {
        return service.getProvinceId(id);
    }

    @PostMapping("/save")
    public String saveProvince () throws Exception {
        ProvinceDto[] provinceDtos = service.getAllProvince();
        service.saveProvince(provinceDtos);
        return "Data Tersimpan";
    }
}
