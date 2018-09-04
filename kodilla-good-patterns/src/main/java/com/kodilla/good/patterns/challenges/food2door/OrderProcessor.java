package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {

    Order order;
    OrderCreator orderCreator;
    OrderProcessor orderProcessor = new OrderProcessor(order);

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return orderCreator.createOrder();
    }


    public void process()
    {
        System.out.println("Processing...");
    }

    public void orderProcessing()
    {
        switch (order.getAvailableCompanies())
        {
            case EXTRA_FOOD_SHOP: this.orderProcessor.process();
                break;
            case HEALTHY_SHOP: this.orderProcessor.process();
                break;
            case GLUTEN_FREE_SHOP: this.orderProcessor.process();
                break;
        }
    }
}
