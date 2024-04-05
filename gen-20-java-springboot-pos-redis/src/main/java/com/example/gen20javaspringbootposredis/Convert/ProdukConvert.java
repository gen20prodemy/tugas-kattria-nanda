package com.example.gen20javaspringbootposredis.Convert;

import com.example.gen20javaspringbootposredis.Entity.ProdukEntity;
import com.example.gen20javaspringbootposredis.ModelDto.ProdukDto;

public class ProdukConvert {
    public static ProdukDto entityToDto (ProdukEntity produkEntity){
        return new ProdukDto(
                produkEntity.getProdukNama(),
                produkEntity.getProdukHarga(),
                produkEntity.getKategoriEntity()
        );
    }

    public static ProdukEntity dtoToEntity (ProdukDto produkDto){
        return new ProdukEntity(
                produkDto.getProdukNama(),
                produkDto.getProdukHarga(),
                produkDto.getKategoriId()
        );
    }
}
