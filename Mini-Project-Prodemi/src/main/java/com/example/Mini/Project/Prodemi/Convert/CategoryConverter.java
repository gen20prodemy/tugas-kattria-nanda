package com.example.Mini.Project.Prodemi.Convert;

import com.example.Mini.Project.Prodemi.Dto.CategoryDto;
import com.example.Mini.Project.Prodemi.Entity.Category;

public class CategoryConverter {
    public static CategoryDto entityToDto (Category category){
        return new CategoryDto(category.getName());
    }

    public static Category dtoToEntity (CategoryDto categoryDto){
        return new Category(categoryDto.getName());
    }
}
