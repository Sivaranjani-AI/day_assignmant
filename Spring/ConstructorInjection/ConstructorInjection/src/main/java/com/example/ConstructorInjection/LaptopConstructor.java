package com.example.ConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class LaptopConstructor {
    private Battery battery;

    public LaptopConstructor(Battery battery) {
        this.battery = battery;
    }

    public void startLaptop() {
        System.out.println("Laptop is starting");
        battery.power();
    }
}
