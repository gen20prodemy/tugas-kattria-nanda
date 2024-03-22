package com.example.gen20javaspringbootpos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produk")
public class ProdukEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long produkId;
    @Column
    private String produkNama;
    @Column
    private Double produkHarga;

//    @Column
//    private Integer kategoriId;
    @ManyToOne
    @JoinColumn (name = "kategori_id")
    private KategoriEntity kategoriId;

    public ProdukEntity() {
    }

    public ProdukEntity(Long produkId, String produkNama, Double produkHarga, KategoriEntity kategoriId) {
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
