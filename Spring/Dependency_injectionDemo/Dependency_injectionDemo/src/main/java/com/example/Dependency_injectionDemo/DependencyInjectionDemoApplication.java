package com.example.Dependency_injectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		LaptopField l = context.getBean(LaptopField.class);

		l.startLaptop();
	}

}
