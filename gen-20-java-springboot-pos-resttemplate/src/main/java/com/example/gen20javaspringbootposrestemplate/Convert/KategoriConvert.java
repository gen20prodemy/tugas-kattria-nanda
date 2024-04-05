package com.example.gen20javaspringbootposrestemplate.Convert;

import com.example.gen20javaspringbootposrestemplate.Entity.KategoriEntity;
import com.example.gen20javaspringbootposrestemplate.ModelDto.KategoriDto;

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
