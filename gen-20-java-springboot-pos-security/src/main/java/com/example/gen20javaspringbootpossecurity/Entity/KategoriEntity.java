package com.example.gen20javaspringbootpos.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "kategori")
public class KategoriEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long katId;
    @Column
    private String katNama;

    public KategoriEntity() {
    }

    public KategoriEntity(Long katId) {
        this.katId = katId;
    }

    public KategoriEntity(String katNama) {
        this.katNama = katNama;
    }

    public Long getKatId() {
        return katId;
    }

    public void setKatId(Long katId) {
        this.katId = katId;
    }

    public String getKatNama() {
        return katNama;
    }

    public void setKatNama(String katNama) {
        this.katNama = katNama;
    }
}
