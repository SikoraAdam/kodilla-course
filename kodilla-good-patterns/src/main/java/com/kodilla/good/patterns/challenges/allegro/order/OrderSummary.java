package com.kodilla.good.patterns.challenges.allegro.order;

import com.kodilla.good.patterns.challenges.allegro.product.Product;
import com.kodilla.good.patterns.challenges.allegro.user.User;

public class OrderSummary {
    private User buyer;
    private Product product;
    private Order order;

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
