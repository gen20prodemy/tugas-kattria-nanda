package com.example.gen20javaspingbootposproducerkafka.Config;
import com.example.gen20javaspingbootposproducerkafka.Dto.ClientDto;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
//    @Bean
//    public ProducerFactory <String, String> procedureFactory (){
//        Map<String, Object> configProps = new HashMap<>();
//        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class );
//        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return  new DefaultKafkaProducerFactory<>(configProps);
//    }
//    @Bean
//    public KafkaTemplate <String, String> kafkaTemplate(){
//        return new KafkaTemplate<>(procedureFactory());
//    }
    @Bean
    public ProducerFactory <String, ClientDto> procedureFactory (){
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class );
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return  new DefaultKafkaProducerFactory<>(configProps);
    }
    @Bean
    public KafkaTemplate <String, ClientDto> kafkaTemplate(){
        return new KafkaTemplate<>(procedureFactory());
    }
}
