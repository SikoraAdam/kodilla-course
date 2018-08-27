package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private Company company;
    private Product product;
    private double totalCost;
    private int orderId;

    public Order(Company company, Product product, int orderId, double totalCost) {
        this.company = company;
        this.product = product;
        this.orderId = orderId;
        this.totalCost = totalCost;
    }

    public Company getCompany() {
        return company;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
