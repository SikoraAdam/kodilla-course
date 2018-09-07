package com.kodilla.good.patterns.challenges.food2door.order;


import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;

public class OrderProcessor {

    private ExtraFoodShop extraFoodShop;
    private HealthyShop healthyShop;
    private GlutenFreeShop glutenFreeShop;

    public OrderProcessor(ExtraFoodShop extraFoodShop, HealthyShop healthyShop, GlutenFreeShop glutenFreeShop) {
        this.extraFoodShop = extraFoodShop;
        this.healthyShop = healthyShop;
        this.glutenFreeShop = glutenFreeShop;
    }

    public void process(Order order)
    {
        switch (order.getAvailableCompanies())
        {
            case EXTRA_FOOD_SHOP: this.extraFoodShop.processOrder(order);
                break;
            case HEALTHY_SHOP: this.healthyShop.processOrder(order);
                break;
            case GLUTEN_FREE_SHOP: this.glutenFreeShop.processOrder(order);
                break;
                default:
                    System.out.println("Please choose available company.");
        }
    }

}
