package com.example.gen20javaspringbootposrestemplate.RajaOngkir.Service;

import com.example.gen20javaspringbootposrestemplate.RajaOngkir.Dto.OngkirRequestDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OngkirService {
    private final RestTemplate restTemplate;


    public OngkirService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getOngkir (OngkirRequestDto ongkir){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("key", "ebeb638bb550438d3bc038c549fa722c");

        String body = "{"+
                "origin= "+ongkir.getOrigin() +
                "&destination= " +ongkir.getDestination()+
                "&weight= "+ongkir.getWeight()+
                "&courier= "+ongkir.getCourier()+
                "}";

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(
                "https://api.rajaongkir.com/starter/cost",
                HttpMethod.POST,
                new HttpEntity<>(body,headers),
                String.class
        ).getBody();
    }
}
