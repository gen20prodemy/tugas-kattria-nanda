package com.example.gen20javaspringbootposrestemplate.RajaOngkir.Repository;

import com.example.gen20javaspringbootposrestemplate.RajaOngkir.Entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepo extends JpaRepository<Province, Long> {
}
