package com.example.Payment.application;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
