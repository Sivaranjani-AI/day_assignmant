package com.example.Animal.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AnimalApplication.class, args);

		AnimalService service = context.getBean(AnimalService.class);

		service.makeSound();
	}

}
