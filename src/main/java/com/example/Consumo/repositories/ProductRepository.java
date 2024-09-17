package com.example.Consumo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Consumo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
   
}
