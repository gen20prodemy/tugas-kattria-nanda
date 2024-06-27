package com.example.gen20javaspringbootpos.Service;

import com.example.gen20javaspringbootpos.Convert.ProdukConvert;
import com.example.gen20javaspringbootpos.Entity.KategoriEntity;
import com.example.gen20javaspringbootpos.Entity.ProdukEntity;
import com.example.gen20javaspringbootpos.ModelDto.ProdukDto;
import com.example.gen20javaspringbootpos.Repository.KategoriRepository;
import com.example.gen20javaspringbootpos.Repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdukService {

    private final ProdukRepository produkRepository;
    private final KategoriRepository kategoriRepository;

//    @Autowired
//    public ProdukService (ProdukRepository produkRepository){
//        this.produkRepository = produkRepository;
//    }

   @Autowired
    public ProdukService(ProdukRepository produkRepository, KategoriRepository kategoriRepository) {
        this.produkRepository = produkRepository;
        this.kategoriRepository = kategoriRepository;
    }

    public ProdukDto addProduk (ProdukDto produkDto){
        ProdukEntity produk = ProdukConvert.dtoToEntity(produkDto);
        ProdukEntity saveProduk = produkRepository.save(produk);
        return ProdukConvert.entityToDto(saveProduk);
    }

    public ProdukDto creatProduk (ProdukDto produkDto){
        ProdukEntity produk = ProdukConvert.dtoToEntity(produkDto);
        KategoriEntity kategori = kategoriRepository.findById(produkDto.getKategoriId().getKatId()).orElse(null);
        produk.setKategoriEntity(kategori);
        ProdukEntity saveProduk = produkRepository.save(produk);
        return ProdukConvert.entityToDto(saveProduk);
    }



    public List<ProdukDto> getAllProduk (){
        List <ProdukEntity> produk = produkRepository.findAll();
        return produk.stream().map((produkEntity) -> ProdukConvert.entityToDto(produkEntity)).collect(Collectors.toList());
    }

//    public List <ProdukDto> listProduct (String produkNama, String sort_by, String sort_order){
//
////        Sort.Direction sortOrder = sort_order.equalsIgnoreCase("asc")? Sort.Direction.ASC : Sort.Direction.DESC;
////        Sort sort = Sort.by(sortOrder, sort_by);
//
//        List<ProdukEntity> produk;
//        if (produkNama != null){
//            produk =  produkRepository.findByTitleContainingIgnoreCase(produkNama);
//        } else {
//            produk =  produkRepository.findAll(Sort.by(Sort.Direction.fromString(sort_order), sort_by));
//        }
//        return produk.stream().map((produkEntity) -> ProdukConvert.entityToDto(produkEntity)).collect(Collectors.toList());
//    }

}
