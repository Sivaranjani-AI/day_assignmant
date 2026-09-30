package com.example.FoodManagement.Service;

import com.example.FoodManagement.Entity.FoodOrder;
import com.example.FoodManagement.Repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {

    @Autowired
    private FoodOrderRepository repository;

    public List<FoodOrder> getOrders() {
        return repository.findAll();
    }

    public FoodOrder getOrderById(int id) {
        return repository.findById(id).orElse(null);
    }

    public void addOrders(FoodOrder order) {
        repository.save(order);
    }

    public String updateOrder (FoodOrder order) {
        if (repository.existsById(order.getOrderId())) {
            repository.save(order);
            return "Order updated successfully";
        }
        return " Order not found";
    }

    public String deleteOrder (int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Order deleted successfully";
        }
        return "Order not found";
    }

}
