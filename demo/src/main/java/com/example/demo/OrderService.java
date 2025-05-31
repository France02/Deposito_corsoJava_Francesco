package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService{
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder(String orderDetails) {
        // Logic to place the order
        System.out.println("Order placed: " + orderDetails);
        
        // Send notification after placing the order
        notificationService.sendNotification("Order placed successfully: " + orderDetails);
    }
}