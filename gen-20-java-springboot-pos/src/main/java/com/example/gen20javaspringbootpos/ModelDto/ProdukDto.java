package com.example.gen20javaspringbootpos.ModelDto;

import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

public class ProdukDto {
    private Long produkId;
    private String produkNama;
    private Double produkHarga;
//    private Integer kategoriId;
    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private KategoriEntity kategoriId;

    public ProdukDto() {
    }

    public ProdukDto(Long produkId, String produkNama, Double produkHarga, KategoriEntity kategoriId) {
        this.produkId = produkId;
        this.produkNama = produkNama;
        this.produkHarga = produkHarga;
        this.kategoriId = kategoriId;
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

    public KategoriEntity getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(KategoriEntity kategoriId) {
        this.kategoriId = kategoriId;
    }
}
