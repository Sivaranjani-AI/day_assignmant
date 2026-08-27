package com.example.Animal.application;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog says Bow Bow");
    }

}
