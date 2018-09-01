package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private Company company;
    private double totalCost;
    private int orderId;

    public Order(Company company, int orderId, double totalCost) {
        this.company = company;
        this.orderId = orderId;
        this.totalCost = totalCost;
    }

    public Company getCompany() {
        return company;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalCost() { return totalCost; }

}
