package com.example.loose.coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(LooseCouplingApplication.class, args);

		student s = context.getBean(student.class);
		s.writeExam();
	}
}
