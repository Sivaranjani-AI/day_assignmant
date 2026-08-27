package com.example.FieldInjection;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public void power() {
        System.out.println("Battery is supplying power");
    }
}
