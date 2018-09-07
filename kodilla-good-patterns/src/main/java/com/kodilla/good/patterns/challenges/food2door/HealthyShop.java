package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Shop {
    @Override
    public void processOrder(Order order) {
        System.out.println("HealthyShop order - processing...");
    }
}
