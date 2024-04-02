package com.example.gen20javaspringbootpos.Convert;

import com.example.gen20javaspringbootpos.Entity.ProdukEntity;
import com.example.gen20javaspringbootpos.ModelDto.ProdukDto;

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
