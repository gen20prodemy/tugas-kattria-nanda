package com.example.Mini.Project.Prodemi.Service;

import com.example.Mini.Project.Prodemi.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    
}
