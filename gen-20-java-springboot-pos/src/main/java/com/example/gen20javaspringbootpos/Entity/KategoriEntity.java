package com.example.gen20javaspringbootpos.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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

    public KategoriEntity(Long katId, String katNama) {
        this.katId = katId;
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
