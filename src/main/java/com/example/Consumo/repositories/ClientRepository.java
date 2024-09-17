package com.example.Consumo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Consumo.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
   
}
