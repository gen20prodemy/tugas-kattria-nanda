package com.example.gen20javaspingbootposcostumerkafka.Service;

import com.example.gen20javaspingbootposcostumerkafka.Dto.ClientDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerService {

//    @KafkaListener(topics = "database-kafka", groupId = "my-group-id")
//    public void listen (String message){
//        System.out.println("Received message: "+message);
//    }
    @KafkaListener(topics = "database-kafka", groupId = "my-group-id")
    public void listen (ClientDto dto){
        System.out.println("Received message: \n"+dto);
    }
}
