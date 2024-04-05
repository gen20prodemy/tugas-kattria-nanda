package com.example.gen20javaspringbootposshceduler.RajaOngkir.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String provinceId;
    @Column
    private String province;

    public Province() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Province(Long id, String provinceId, String province) {
        this.id = id;
        this.provinceId = provinceId;
        this.province = province;
    }
}
