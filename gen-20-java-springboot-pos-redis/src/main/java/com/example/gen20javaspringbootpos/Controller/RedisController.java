package com.example.gen20javaspringbootpos.Controller;

import com.example.gen20javaspringbootpos.ModelDto.KategoriDto;
import com.example.gen20javaspringbootpos.Service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public KategoriDto addRedis(@RequestBody KategoriDto kategoriDto) {
        return redisService.addRedis(kategoriDto);
    }

}
