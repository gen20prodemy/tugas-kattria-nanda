package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.Entity.Produk;
import com.example.gen20javaspringbootpos.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdukService {
    private final PostRepository produkRepository;

    @Autowired
    public ProdukService (PostRepository produkRepository){
        this.produkRepository = produkRepository;
    }

    public List <Produk> getAllData (){
        return produkRepository.findAll();
    }

    public List<Produk> getProduk (){
        return produkRepository.findAll();
    }

    public  void addProdukBaru (Produk produk){
        produkRepository.save(produk);
    }
}
