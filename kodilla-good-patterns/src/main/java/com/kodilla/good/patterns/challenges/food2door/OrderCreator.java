package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    private Company company;
    private double totalCost;
    private int orderId;
    private String deliveryAddress;

    public Order createOrder()
    {
        company = new Company("ExtraFoodShop", "St.Spirit 12", "123456789");
        totalCost = 15.20;
        orderId = 123;
        deliveryAddress = "St.Coconut 12";

        return new Order(company, orderId, deliveryAddress, totalCost);
    }

    public Company getCompany() {
        return company;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
