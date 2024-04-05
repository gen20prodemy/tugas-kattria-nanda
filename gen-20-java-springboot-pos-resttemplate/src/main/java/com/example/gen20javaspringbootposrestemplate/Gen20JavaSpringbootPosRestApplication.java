package com.example.gen20javaspringbootposrestemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
public class Gen20JavaSpringbootPosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen20JavaSpringbootPosRestApplication.class, args);
	}

	//inisialisasi rest tamplate
	@Bean
	public RestTemplate restTemplate (RestTemplateBuilder builder){

		return builder
				.setConnectTimeout(Duration.ofMillis(3000))
				.setReadTimeout(Duration.ofMillis(3000))
				.build();
	}
}
