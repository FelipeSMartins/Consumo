package com.example.Consumo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Consumo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
   
}
