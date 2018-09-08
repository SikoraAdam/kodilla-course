package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.order.Order;

public class HealthyShop implements Shop {
    @Override
    public void processOrder(Order order) {
        System.out.println("HealthyShop order - processing...");
    }
}
