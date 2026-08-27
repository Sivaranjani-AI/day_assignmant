package com.example.FieldInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FieldInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FieldInjectionApplication.class, args);

		LaptopField l = context.getBean(LaptopField.class);

		l.startLaptop();
	}

}
