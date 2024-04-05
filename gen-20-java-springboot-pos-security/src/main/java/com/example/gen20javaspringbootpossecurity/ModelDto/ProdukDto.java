package com.example.gen20javaspringbootpossecurity.ModelDto;

import com.example.gen20javaspringbootpossecurity.Entity.KategoriEntity;
import jakarta.validation.constraints.NotEmpty;

public class ProdukDto {
    @NotEmpty(message = "Nama produk kosong!")
    private String produkNama;
    private Double produkHarga;
//    @ManyToOne
//    @JoinColumn(name = "kategori_id")
    private KategoriEntity kategoriId;

    public ProdukDto(String produkNama, Double produkHarga, KategoriEntity kategoriId) {
        this.produkNama = produkNama;
        this.produkHarga = produkHarga;
        this.kategoriId = kategoriId;
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
