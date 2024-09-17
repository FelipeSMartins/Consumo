package com.example.Consumo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Consumo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
