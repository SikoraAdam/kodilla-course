package com.kodilla.good.patterns.challenges.modul_9_2.order_repository;

import com.kodilla.good.patterns.challenges.modul_9_2.order.Order;
import com.kodilla.good.patterns.challenges.modul_9_2.user.User;
import com.kodilla.good.patterns.challenges.modul_9_2.product.Product;

public interface OrderRepository {
    boolean createRepository(User user, Product product, Order order);
}
