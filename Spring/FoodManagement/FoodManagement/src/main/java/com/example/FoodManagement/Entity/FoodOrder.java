package com.example.FoodManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrder {

    @Id
    private int orderId;
    private String itemName;
    private int quantity;
    private double price;
}
