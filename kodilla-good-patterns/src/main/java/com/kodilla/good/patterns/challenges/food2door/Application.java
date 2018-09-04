package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.createOrder();
        OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop);
        orderProcessor.process(order);
    }
}
