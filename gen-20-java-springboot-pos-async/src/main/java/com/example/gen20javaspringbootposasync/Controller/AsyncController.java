package com.example.gen20javaspringbootposasync.Controller;

import com.example.gen20javaspringbootposasync.ModelDto.KategoriDto;
import com.example.gen20javaspringbootposasync.Service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AsyncService service;

    @GetMapping("/method1")
    public CompletableFuture<String> method1(){
        return service.method1();
    }
    @GetMapping("/method2")
    public CompletableFuture<String> method2(){
        return service.method2();
    }
    @GetMapping("/method3")
    public CompletableFuture <List<KategoriDto>>getAllCategory() throws InterruptedException {
        CompletableFuture<List<KategoriDto>> futureCategory = service.getAllCategoryAsync();
        futureCategory.thenRun(()-> System.out.println("Selesai"));
        return futureCategory;
    }

}
