package com.example.gen20javaspringbootpos.Repository;

import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository <KategoriEntity, Long> {
}
