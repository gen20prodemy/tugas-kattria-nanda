package com.example.Mini.Project.Prodemi.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

@Data
public class CategoryDto {
    @NotNull
    @UniqueElements
    private String name;

    public CategoryDto(String name) {
        this.name = name;
    }
}
