package com.example.gen20javaspringbootposshceduler.Repository;

import com.example.gen20javaspringbootposshceduler.Entity.KategoriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository <KategoriEntity, Long> {
}
