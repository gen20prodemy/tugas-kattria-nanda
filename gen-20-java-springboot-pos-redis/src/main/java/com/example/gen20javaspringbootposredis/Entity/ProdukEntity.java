package com.example.gen20javaspringbootposredis.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produk")
public class ProdukEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produkId;
    @Column
    private String produkNama;
    @Column
    private Double produkHarga;

    @ManyToOne
    private KategoriEntity kategoriEntity;

    public ProdukEntity() {
    }

    public ProdukEntity( String produkNama, Double produkHarga, KategoriEntity kategoriEntity) {
        this.produkNama = produkNama;
        this.produkHarga = produkHarga;
        this.kategoriEntity = kategoriEntity;
    }

    public Long getProdukId() {
        return produkId;
    }

    public void setProdukId(Long produkId) {
        this.produkId = produkId;
    }

    public String getProdukNama() {
        return produkNama;
    }

    public void setProdukNama(String produkNama) {
        this.produkNama = produkNama;
    }

    public Double getProdukHarga() {
        return produkHarga;
    }

    public void setProdukHarga(Double produkHarga) {
        this.produkHarga = produkHarga;
    }

    public KategoriEntity getKategoriEntity() {
        return kategoriEntity;
    }

    public void setKategoriEntity(KategoriEntity kategoriEntity) {
        this.kategoriEntity = kategoriEntity;
    }
}
