package com.example.StudentResponseEntity.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = " student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private int rno;
    private String name;
    private String technology;
}
