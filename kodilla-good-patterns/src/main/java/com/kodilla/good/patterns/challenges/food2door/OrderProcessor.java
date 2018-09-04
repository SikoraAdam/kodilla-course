package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {

    Order order;
    OrderCreator orderCreator;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return orderCreator.createOrder();
    }

    OrderProcessor orderProcessor = new OrderProcessor();


    public void process(Order order)
    {
        System.out.println("Processing...");
    }

    public void orderProcessing()
    {
        switch (order.getAvailableCompanies())
        {
            case EXTRA_FOOD_SHOP: this.orderProcessor.process(order);
                break;
            case HEALTHY_SHOP: this.orderProcessor.process(order);
                break;
            case GLUTEN_FREE_SHOP: this.orderProcessor.process(order);
                break;
        }
    }
}
