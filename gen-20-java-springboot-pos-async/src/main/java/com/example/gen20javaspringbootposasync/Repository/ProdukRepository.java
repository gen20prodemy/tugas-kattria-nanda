package com.example.gen20javaspringbootposasync.Repository;

import com.example.gen20javaspringbootposasync.Entity.ProdukEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository <ProdukEntity, Long> {
//    @Query (value = "SELECT * FROM produk", nativeQuery = true)
//    List<ProdukEntity> findAllProduk ();

//    @Transactional
//    @Modifying
//    @Query (value = "INSERT INTO produk (produk_nama, produk_harga, kategori_id) VALUES (:produk_nama, :produk_harga, :kategori_id)", nativeQuery = true)
//    void insertProduk  (@Param("Laptop Asus")String produkNama, @Param("435")double produkHarga, @Param("1")KategoriEntity kategoriId);
}
