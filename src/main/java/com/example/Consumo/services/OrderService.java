package com.example.Consumo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Consumo.entities.Order;
import com.example.Consumo.entities.OrderItem;
import com.example.Consumo.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderRepository orderRepository;

    public void fetchAndSaveOrders() {
        String apiUrl = "http://localhost:8080/orders";
        
        ResponseEntity<OrderItem> response = restTemplate.getForEntity(apiUrl, OrderItem.class);
        List<Order> orders = (List<Order>) response.getBody().getProduct();
        orderRepository.saveAll(orders);
    }
}