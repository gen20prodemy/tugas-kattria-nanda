package com.example.gen20javaspringbootpos.Convert;

import com.example.gen20javaspringbootpos.Entity.ProdukEntity;
import com.example.gen20javaspringbootpos.ModelDto.ProdukDto;

public class ProdukConvert {
    public static ProdukDto entityToDto (ProdukEntity produkEntity){
        return new ProdukDto(
                produkEntity.getProdukId(),
                produkEntity.getProdukNama(),
                produkEntity.getProdukHarga(),
                produkEntity.getKategoriId()
        );
    }

    public static ProdukEntity dtoToEntity (ProdukDto produkDto){
        return new ProdukEntity(
                produkDto.getProdukId(),
                produkDto.getProdukNama(),
                produkDto.getProdukHarga(),
                produkDto.getKategoriId()
        );
    }
}
