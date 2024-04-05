package com.example.gen20javaspingbootposproducerkafka.Service;

import com.example.gen20javaspingbootposproducerkafka.Dto.ClientDto;
import com.example.gen20javaspingbootposproducerkafka.Entity.Client;
import com.example.gen20javaspingbootposproducerkafka.Repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProducerDatabaseService {
    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private KafkaTemplate<String, ClientDto> kafkaTemplate;

    private ClientDto convertToDto (Client client){
        ClientDto dto = new ClientDto();
        dto.setUserName(client.getUserName());
        return dto;
    }
    public void dataToKafka(){
        List<Client> clients = clientRepo.findAll();

        List<ClientDto> dtos = clients.stream().map(this::convertToDto).collect(Collectors.toList());
        for (ClientDto dto : dtos){
            kafkaTemplate.send("database-kafka",dto);
        }

    }
}
