package com.example.Animal.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    public void makeSound() {
        animal.sound();
    }
}
