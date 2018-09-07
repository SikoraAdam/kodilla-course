package com.kodilla.good.patterns.challenges.food2door;

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
