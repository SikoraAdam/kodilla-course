package com.kodilla.good.patterns.challenges.food2door;

public class OrderDetails {
    private Company company;
    private double totalCost;
    private int orderId;
    private String deliveryAddress;

    public OrderDetails(Company company, double totalCost, int orderId, String deliveryAddress) {
        this.company = company;
        this.totalCost = totalCost;
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
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
