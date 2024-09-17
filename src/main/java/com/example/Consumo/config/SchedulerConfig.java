package com.example.Consumo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.Consumo.services.OrderService;
import com.example.Consumo.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Configuration
@EnableScheduling
public class SchedulerConfig {

    //@Autowired
    //private OrderService orderService;
    
    @Autowired
    private UserService userService;

    @Scheduled(fixedRate = 60000) // Executa a cada minuto
    public void fetchAndSaveOrders() throws JsonMappingException, JsonProcessingException {
    	userService.fetchAndSaveUsers();
    }
}
