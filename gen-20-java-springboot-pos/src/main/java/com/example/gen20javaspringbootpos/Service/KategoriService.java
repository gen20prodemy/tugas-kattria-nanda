package com.example.gen20javaspringbootpos.Service;

import com.example.gen20javaspringbootpos.Convert.KategoriConvert;
import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import com.example.gen20javaspringbootpos.ModelDto.KategoriDto;
import com.example.gen20javaspringbootpos.Repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KategoriService {

    private final KategoriRepository kategoriRepository;

    @Autowired
    public KategoriService(KategoriRepository kategoriRepository) {
        this.kategoriRepository = kategoriRepository;
    }

    public KategoriDto addKategori (KategoriDto kategoriDto){
        KategoriEntity kategori = KategoriConvert.dtoToEntity(kategoriDto);
        KategoriEntity saveKategori = kategoriRepository.save(kategori);
        return KategoriConvert.entityToDto(saveKategori);
    }
    public List<KategoriDto> getAllKategori (){
        List <KategoriEntity> kategori = kategoriRepository.findAll();
        return kategori.stream().map((kategoriEntity) -> KategoriConvert.entityToDto(kategoriEntity)).collect(Collectors.toList());
    }


}
