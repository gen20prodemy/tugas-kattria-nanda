package com.example.gen20javaspringbootposredis.Convert;

import com.example.gen20javaspringbootposredis.Entity.KategoriEntity;
import com.example.gen20javaspringbootposredis.ModelDto.KategoriDto;

public class KategoriConvert {
    public static KategoriDto entityToDto (KategoriEntity kategoriEntity){
        return new KategoriDto(
                kategoriEntity.getKatNama()
        );
    }
    public static KategoriEntity dtoToEntity (KategoriDto kategoriDto){
        return new KategoriEntity(
                kategoriDto.getKatNama()
        );
    }
}
