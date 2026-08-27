package com.example.Payment.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    private Payment payment;

    public void makePayment() {
        payment.pay();
    }
}
