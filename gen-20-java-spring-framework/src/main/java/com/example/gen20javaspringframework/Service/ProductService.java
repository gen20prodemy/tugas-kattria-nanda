package com.example.gen20javaspringframework.Service;

import com.example.gen20javaspringframework.Entity.Product;
import com.example.gen20javaspringframework.Repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Transactional
public class ProductService {
   @Autowired
    private ProductRepository productRepository;

    public  Iterable<Product> findAll (){
        return productRepository.findAll();
    }
    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

}
