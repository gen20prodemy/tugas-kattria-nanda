package com.example.gen20javaspringbootposshceduler.RajaOngkir.Service;

import com.example.gen20javaspringbootposshceduler.RajaOngkir.Dto.ProvinceDto;
import com.example.gen20javaspringbootposshceduler.RajaOngkir.Entity.Province;
import com.example.gen20javaspringbootposshceduler.RajaOngkir.Repository.ProvinceRepo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {

    @Autowired
    private ProvinceRepo provinceRepo;

    private final String apiKey = "ebeb638bb550438d3bc038c549fa722c";
    private final String baseUrl = "https://api.rajaongkir.com/starter/province";

    public ProvinceDto[] getAllProvince () throws Exception{
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("key", apiKey);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                baseUrl,
                HttpMethod.GET,
                httpEntity,
                String.class
        );
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(response.getBody());
        JsonNode results = root.path("rajaongkir").path("results");
        return objectMapper.treeToValue(results, ProvinceDto[].class);

    }

    public ResponseEntity<String> getProvinceId (int id) throws Exception{
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("key", apiKey);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                baseUrl+"?id="+id,
                HttpMethod.GET,
                httpEntity,
                String.class
        );
        return response;

    }


    public void saveProvince (ProvinceDto[] provinceDtos){
        for(ProvinceDto provinceDto : provinceDtos){
            Province province = new Province();
            province.setProvinceId(provinceDto.getProvinceId());
            province.setProvince(provinceDto.getProvince());
            provinceRepo.save(province);
        }
    }

//
//    public ResponseEntity<String> getProvince () {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        headers.set("key", "ebeb638bb550438d3bc038c549fa722c");
//        String baseUrl = "https://api.rajaongkir.com/starter/province";
//
//        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                baseUrl,
//                HttpMethod.GET,
//                httpEntity,
//                String.class
//        );
//
//
//        return response;
//    }
}
