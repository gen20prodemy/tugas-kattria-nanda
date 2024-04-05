package com.example.gen20javaspringbootpossecurity.Repository;

import com.example.gen20javaspringbootpossecurity.Entity.KategoriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository <KategoriEntity, Long> {
}
