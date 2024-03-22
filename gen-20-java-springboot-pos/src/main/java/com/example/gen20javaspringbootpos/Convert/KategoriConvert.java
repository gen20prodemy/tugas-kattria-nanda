package com.example.gen20javaspringbootpos.Convert;

import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import com.example.gen20javaspringbootpos.ModelDto.KategoriDto;

public class KategoriConvert {
    public static KategoriDto entityToDto (KategoriEntity kategoriEntity){
        return new KategoriDto(
                kategoriEntity.getKatId(),
                kategoriEntity.getKatNama()

        );
    }

    public static KategoriEntity dtoToEntity (KategoriDto kategoriDto){
        return new KategoriEntity(
                kategoriDto.getKatId(),
                kategoriDto.getKatNama()
        );
    }
}
