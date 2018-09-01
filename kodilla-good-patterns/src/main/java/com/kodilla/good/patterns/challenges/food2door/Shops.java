package com.kodilla.good.patterns.challenges.food2door;

import static com.kodilla.good.patterns.challenges.food2door.AvailableCompany.*;

public class Shops {

    OrderCreator orderCreator = new OrderCreator();
    Order order = orderCreator.createOrder();

    public Company getShop()
    {

        switch (order.getCompany() == ExtraFoodShop)
        {

        }
    }
}
