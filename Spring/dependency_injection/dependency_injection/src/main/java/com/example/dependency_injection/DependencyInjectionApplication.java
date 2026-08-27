package com.example.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// Start Spring Boot application
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		//Get Student bean from Spring container
		Student s = context.getBean(Student.class);

		//Call methods
		s.writeExam();
	}
}
