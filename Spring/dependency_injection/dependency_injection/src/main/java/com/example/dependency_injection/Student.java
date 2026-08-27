package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    // Field Injection
    private Pen pen;

    // Setter Injection
    public void setPen(Pen pen) {
        this.pen = pen;
    }
    @Autowired// Constructor Injection
    public Student(Pen pen) {
        this.pen = pen;
    }

    public void writeExam() {
        System.out.println("Student is writing exam");
        pen.write();
    }
}
