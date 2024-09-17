package com.example.Consumo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Consumo.repositories.ClientRepository;
import com.example.Consumo.entities.*;

@RestController
@RequestMapping("/client")
public class UserController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}

}
