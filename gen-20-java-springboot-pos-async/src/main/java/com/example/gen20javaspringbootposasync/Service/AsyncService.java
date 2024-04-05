package com.example.gen20javaspringbootposasync.Service;

import com.example.gen20javaspringbootposasync.Convert.KategoriConvert;
import com.example.gen20javaspringbootposasync.Entity.KategoriEntity;
import com.example.gen20javaspringbootposasync.ModelDto.KategoriDto;
import com.example.gen20javaspringbootposasync.Repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
@Service
public class AsyncService {
    @Autowired
    private KategoriRepository kategoriRepository;
    @Async
    public CompletableFuture <List<KategoriDto>> getAllCategoryAsync() throws InterruptedException {
        Thread.sleep(10000);
        List<KategoriEntity> category = kategoriRepository.findAll();
        return CompletableFuture.completedFuture(
                category.stream().map((categorys)->
                        KategoriConvert.entityToDto(categorys)).collect(Collectors.toList()));
    }
    public static CompletableFuture<String> method1(){

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return "Method 1 selesai";
        });
        return future;
    }
    public static CompletableFuture<String> method2(){

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(7000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return "Method 2 selesai";
        });
        return future;
    }

}
