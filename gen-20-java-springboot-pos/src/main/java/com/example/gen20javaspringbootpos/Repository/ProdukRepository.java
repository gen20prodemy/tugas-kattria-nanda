package com.example.gen20javaspringbootpos.Repository;

import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import com.example.gen20javaspringbootpos.Entity.ProdukEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdukRepository extends JpaRepository <ProdukEntity, Long> {
//    @Query (value = "SELECT * FROM produk", nativeQuery = true)
//    List<ProdukEntity> findAllProduk ();

//    @Transactional
//    @Modifying
//    @Query (value = "INSERT INTO produk (produk_nama, produk_harga, kategori_id) VALUES (:produk_nama, :produk_harga, :kategori_id)", nativeQuery = true)
//    void insertProduk  (@Param("Laptop Asus")String produkNama, @Param("435")double produkHarga, @Param("1")KategoriEntity kategoriId);
}
