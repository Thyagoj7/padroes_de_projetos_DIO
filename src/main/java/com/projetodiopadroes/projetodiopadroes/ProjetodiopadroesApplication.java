package com.projetodiopadroes.projetodiopadroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetodiopadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetodiopadroesApplication.class, args);
	}

}
