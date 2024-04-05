package com.example.gen20javaspringbootpos.RajaOngkir.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvinceDto {
    private String provinceId;
    private String province;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvince_id(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString(){
        return "ProvinceDto{"+
                "provinceId= '"+provinceId +'\''+
                ", province='"+province + '\''+
                '}';
    }
}
