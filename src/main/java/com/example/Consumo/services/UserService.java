package com.example.Consumo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Consumo.entities.Client;
import com.example.Consumo.entities.Order;
import com.example.Consumo.entities.OrderItem;
import com.example.Consumo.repositories.ClientRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aj.org.objectweb.asm.TypeReference;

@Service
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ClientRepository clientRepository;
	
	public void fetchAndSaveUsers() throws JsonMappingException, JsonProcessingException {
		String apiUrl = "http://localhost:8080/users";

		ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

		ObjectMapper objectMapper = new ObjectMapper();
		List<Client> users = objectMapper.readValue(response.getBody(), new com.fasterxml.jackson.core.type.TypeReference<List<Client>>() {
		});

		clientRepository.saveAll(users);
    }

}
