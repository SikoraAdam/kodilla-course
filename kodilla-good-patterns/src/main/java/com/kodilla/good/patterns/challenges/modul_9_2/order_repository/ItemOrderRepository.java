package com.kodilla.good.patterns.challenges.modul_9_2.order_repository;

import com.kodilla.good.patterns.challenges.modul_9_2.order.Order;
import com.kodilla.good.patterns.challenges.modul_9_2.user.User;
import com.kodilla.good.patterns.challenges.modul_9_2.product.Product;

public class ItemOrderRepository implements OrderRepository {

    @Override
    public boolean createRepository(User user, Product product, Order order) {

        System.out.println("Added to repository:");
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Buyer: " + user.getUserName());
        System.out.println("Ordered product: " + product.getProductName());
        System.out.println("Product Id: " + product.getPruductId());
        System.out.println("Date of order: " + order.getDateOfOrder());

        return true;
    }
}
