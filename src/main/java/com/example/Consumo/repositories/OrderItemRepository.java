package com.example.Consumo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Consumo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
   
}
