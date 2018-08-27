package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    Company company;
    Product product;
    int orderId;

    public Order(Company company, Product product, int orderId) {
        this.company = company;
        this.product = product;
        this.orderId = orderId;
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
}
