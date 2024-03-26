package com.example.gen20javaspringframework.Service;

import com.example.gen20javaspringframework.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class ProductService {
    public static List<Product> products = Arrays.asList(
            new Product(1L, "Laptop", "Electronic", 5000.0),
            new Product(2L, "Komputer", "Electronic", 3500.0),
            new Product(3L, "Keyboard", "Electronic Accessoris", 300.0),
            new Product(4L, "Mouse", "Electronic Accessoris", 250.0),
            new Product(5L, "Tas Laptop", "Non-Electronic", 500.0)
    );

    public  List<Product> findAll (){
        return products;
    }
}
