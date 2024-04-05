package com.example.gen20javaspringbootposshceduler.Convert;

import com.example.gen20javaspringbootposshceduler.Entity.KategoriEntity;
import com.example.gen20javaspringbootposshceduler.ModelDto.KategoriDto;

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
