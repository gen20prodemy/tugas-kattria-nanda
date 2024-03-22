package com.example.gen20javaspringbootpos.ModelDto;

public class KategoriDto {
    private Long katId;
    private String katNama;

    public KategoriDto(Long katId, String katNama) {
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
