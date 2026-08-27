package com.example.loose.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class student {

    @Autowired
    public student(@Qualifier("sketch") writertool tool) {
        this.tool = tool;
    }

    private writertool tool;

    public void writeExam() {
        System.out.println("Student is writing an exam");
        tool.write();
    }

}
