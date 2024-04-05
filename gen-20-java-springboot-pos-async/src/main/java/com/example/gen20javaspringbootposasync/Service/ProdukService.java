package com.example.gen20javaspringbootposasync.Service;

import com.example.gen20javaspringbootposasync.Convert.ProdukConvert;
import com.example.gen20javaspringbootposasync.Entity.ProdukEntity;
import com.example.gen20javaspringbootposasync.ModelDto.ProdukDto;
import com.example.gen20javaspringbootposasync.Repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdukService {

    private final ProdukRepository produkRepository;

    @Autowired
    public ProdukService (ProdukRepository produkRepository){
        this.produkRepository = produkRepository;
    }

    public ProdukDto addProduk (ProdukDto produkDto){
        ProdukEntity produk = ProdukConvert.dtoToEntity(produkDto);
        ProdukEntity saveProduk = produkRepository.save(produk);
        return ProdukConvert.entityToDto(saveProduk);
    }

    public List<ProdukDto> getAllProduk (){
        List <ProdukEntity> produk = produkRepository.findAll();
        return produk.stream().map((produkEntity) -> ProdukConvert.entityToDto(produkEntity)).collect(Collectors.toList());
    }

}
