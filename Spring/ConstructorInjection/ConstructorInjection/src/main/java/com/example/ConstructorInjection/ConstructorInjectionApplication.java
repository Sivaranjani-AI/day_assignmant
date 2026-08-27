package com.example.ConstructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ConstructorInjectionApplication.class, args);

		LaptopConstructor laptop =
				context.getBean(LaptopConstructor.class);

		laptop.startLaptop();
	}

}
