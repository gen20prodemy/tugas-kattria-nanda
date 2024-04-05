package com.example.gen20javaspringbootpos.Service;

import com.example.gen20javaspringbootpos.ModelDto.KategoriDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, KategoriDto> redisTemplate;

    public KategoriDto addRedis(KategoriDto kategoriDto) {
        String redisKey = "category";
        redisTemplate.opsForValue().set(redisKey, kategoriDto,1000);
        return kategoriDto;
    }
}
