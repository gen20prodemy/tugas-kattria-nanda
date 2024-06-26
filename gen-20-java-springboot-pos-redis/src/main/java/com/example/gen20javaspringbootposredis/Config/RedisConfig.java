package com.example.gen20javaspringbootposredis.Config;

import com.example.gen20javaspringbootposredis.ModelDto.KategoriDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, KategoriDto> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, KategoriDto> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(KategoriDto.class));
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

}
