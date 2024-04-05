package com.example.gen20javaspringbootposredis.Controller;

import com.example.gen20javaspringbootposredis.ModelDto.KategoriDto;
import com.example.gen20javaspringbootposredis.Service.RedisService;
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
