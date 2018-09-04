package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    public Order createOrder()
    {
        Company company;
        double totalCost;
        int orderId;
        String deliveryAddress;
        OrderDetails orderDetails = new OrderDetails();

        company = orderDetails.getCompany();
        totalCost = orderDetails.getTotalCost();
        orderId = orderDetails.getOrderId();
        deliveryAddress = orderDetails.getDeliveryAddress();

        return new Order(company, orderId, deliveryAddress, totalCost, AvailableCompanies.EXTRA_FOOD_SHOP);
    }

}
