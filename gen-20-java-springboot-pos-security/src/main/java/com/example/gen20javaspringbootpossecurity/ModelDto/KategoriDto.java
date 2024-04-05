package com.example.gen20javaspringbootpossecurity.ModelDto;

import jakarta.validation.constraints.NotEmpty;

public class KategoriDto {
    @NotEmpty(message = "Nama kategori kosong!")
    private String katNama;

    public KategoriDto() {
    }

    public KategoriDto(String katNama) {
        this.katNama = katNama;
    }

    public String getKatNama() {
        return katNama;
    }

    public void setKatNama(String katNama) {
        this.katNama = katNama;
    }
}
