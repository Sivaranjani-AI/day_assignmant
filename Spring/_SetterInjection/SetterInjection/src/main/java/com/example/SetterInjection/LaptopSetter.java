package com.example.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopSetter {
    private Battery battery;

    @Autowired
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void startLaptop() {
        System.out.println("Laptop is starting");
        battery.power();
    }

}
