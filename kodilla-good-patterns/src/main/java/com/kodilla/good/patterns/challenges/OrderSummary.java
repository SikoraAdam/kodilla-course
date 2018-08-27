package com.kodilla.good.patterns.challenges;

public class OrderSummary {
    User buyer;
    Product product;
    Order order;

    public OrderSummary(User buyer, Product product, Order order) {
        this.buyer = buyer;
        this.product = product;
        this.order = order;
    }

    public User getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }
}
