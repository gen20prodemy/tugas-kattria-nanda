package com.example.gen20javaspringbootpos.Repository;

import com.example.gen20javaspringbootpos.Entity.ProdukEntity;
import com.example.gen20javaspringbootpos.ModelDto.ProdukDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdukRepository extends JpaRepository <ProdukEntity, Long> {
//    List<ProdukEntity> findByTitleContainingIgnoreCase(String produkNama);

//    @Query (value = "SELECT * FROM produk", nativeQuery = true)
//    List<ProdukEntity> findAllProduk ();

//    @Transactional
//    @Modifying
//    @Query (value = "INSERT INTO produk (produk_nama, produk_harga, kategori_id) VALUES (:produk_nama, :produk_harga, :kategori_id)", nativeQuery = true)
//    void insertProduk  (@Param("Laptop Asus")String produkNama, @Param("435")double produkHarga, @Param("1")KategoriEntity kategoriId);
}
