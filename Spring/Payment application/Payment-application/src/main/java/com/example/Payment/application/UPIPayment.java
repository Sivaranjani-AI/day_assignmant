package com.example.Payment.application;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }

}
