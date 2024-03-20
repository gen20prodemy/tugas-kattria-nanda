package com.example.gen20javaspringbootpos.Entity;

import jakarta.persistence.*;

@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produk_id;

    @Column
    private String produk_nama;

    @Column
    private Float produk_harga;

    public Long getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(Long produk_id) {
        this.produk_id = produk_id;
    }

    public String getProduk_nama() {
        return produk_nama;
    }

    public void setProduk_nama(String produk_nama) {
        this.produk_nama = produk_nama;
    }

    public Float getProduk_harga() {
        return produk_harga;
    }

    public void setProduk_harga(Float produk_harga) {
        this.produk_harga = produk_harga;
    }

    public Produk() {
    }

    public Produk(Long produk_id, String produk_nama, Float produk_harga) {
        this.produk_id = produk_id;
        this.produk_nama = produk_nama;
        this.produk_harga = produk_harga;
    }
}
