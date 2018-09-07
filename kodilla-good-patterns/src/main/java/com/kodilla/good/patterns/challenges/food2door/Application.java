package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.Order;
import com.kodilla.good.patterns.challenges.food2door.order.OrderCreator;
import com.kodilla.good.patterns.challenges.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;

public class Application {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.createOrder();
        OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop, healthyShop, glutenFreeShop);
        orderProcessor.process(order);
    }
}
