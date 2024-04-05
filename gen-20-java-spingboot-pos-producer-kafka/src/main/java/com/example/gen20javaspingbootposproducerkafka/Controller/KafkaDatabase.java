package com.example.gen20javaspingbootposproducerkafka.Controller;

import com.example.gen20javaspingbootposproducerkafka.Service.ProducerDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaDatabase {
    @Autowired
    private ProducerDatabaseService clientService;

    @GetMapping
    public String pushToKafka (){
        clientService.dataToKafka();
        return "Data berhasil di push ke kafka";
    }

}
