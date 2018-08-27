package com.kodilla.good.patterns.challenges;

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
