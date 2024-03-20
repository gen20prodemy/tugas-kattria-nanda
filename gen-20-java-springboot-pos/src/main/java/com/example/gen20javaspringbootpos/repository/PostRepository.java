package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.Entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Produk, Long> {
}
