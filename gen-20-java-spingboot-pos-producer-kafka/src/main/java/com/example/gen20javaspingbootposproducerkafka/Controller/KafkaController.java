package com.example.gen20javaspingbootposproducerkafka.Controller;

import com.example.gen20javaspingbootposproducerkafka.Service.MessageProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
//    @Autowired
//    private MessageProcedureService messageProducer;
//
//    @PostMapping("/send")
//    public String sendMessage (@RequestParam("message") String message){
//        messageProducer.sendMessage("my-topic", message);
//        return "Message sent: "+message;
//    }
}
