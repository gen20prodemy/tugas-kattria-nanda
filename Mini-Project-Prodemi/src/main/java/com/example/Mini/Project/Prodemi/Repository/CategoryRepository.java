package com.example.Mini.Project.Prodemi.Repository;

import com.example.Mini.Project.Prodemi.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
