package com.example.gen20javaspingbootposproducerkafka.Repository;

import com.example.gen20javaspingbootposproducerkafka.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

}
