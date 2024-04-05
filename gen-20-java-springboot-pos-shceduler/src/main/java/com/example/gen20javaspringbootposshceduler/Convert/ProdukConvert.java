package com.example.gen20javaspringbootposshceduler.Convert;

import com.example.gen20javaspringbootposshceduler.Entity.ProdukEntity;
import com.example.gen20javaspringbootposshceduler.ModelDto.ProdukDto;

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
