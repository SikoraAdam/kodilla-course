package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {

    private ExtraFoodShop extraFoodShop;

    public OrderProcessor(ExtraFoodShop extraFoodShop) {
        this.extraFoodShop = extraFoodShop;
    }

    public void process(Order order)
    {
        switch (order.getAvailableCompanies())
        {
            case EXTRA_FOOD_SHOP: this.extraFoodShop.processOrder(order); //do sklepu
                break;
            case HEALTHY_SHOP:
                break;
            case GLUTEN_FREE_SHOP:
                break;
        }
    }

}
