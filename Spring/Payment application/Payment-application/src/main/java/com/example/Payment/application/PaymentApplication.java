package com.example.Payment.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PaymentApplication.class, args);

		PaymentService service = context.getBean(PaymentService.class);

		service.makePayment();
	}

}
