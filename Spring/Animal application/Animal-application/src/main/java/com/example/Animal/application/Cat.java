package com.example.Animal.application;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat say Meow Meow");
    }
}
