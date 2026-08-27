package com.example.Dependency_injectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopField {

    @Autowired
    private Battery battery;

    public void startLaptop() {
        System.out.println("Laptop is starting");
        battery.power();
    }

}
