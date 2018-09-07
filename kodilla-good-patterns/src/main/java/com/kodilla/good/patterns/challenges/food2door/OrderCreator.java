package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    public Order createOrder()
    {
        OrderDetails orderDetails = new OrderDetails();

        return new Order(orderDetails.getCompany()
                , orderDetails.getOrderId()
                , orderDetails.getDeliveryAddress()
                , orderDetails.getTotalCost()
                , orderDetails.getAvailableCompanies());
    }

}
