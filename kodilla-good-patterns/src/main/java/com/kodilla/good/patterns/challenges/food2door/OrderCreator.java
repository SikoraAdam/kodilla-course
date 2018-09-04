package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    private Company company;
    private double totalCost;
    private int orderId;
    private String deliveryAddress;
    private OrderDetails orderDetails = new OrderDetails();

    public Order createOrder()
    {
        company = orderDetails.getCompany();
        totalCost = orderDetails.getTotalCost();
        orderId = orderDetails.getOrderId();
        deliveryAddress = orderDetails.getDeliveryAddress();

        return new Order(company, orderId, deliveryAddress, totalCost);
    }

}
