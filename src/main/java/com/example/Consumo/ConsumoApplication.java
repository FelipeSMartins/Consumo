package com.example.Consumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ConsumoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApplication.class, args);
	}

}
