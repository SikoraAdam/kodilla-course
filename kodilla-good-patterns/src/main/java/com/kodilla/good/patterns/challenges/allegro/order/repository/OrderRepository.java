package com.kodilla.good.patterns.challenges.allegro.order.repository;

import com.kodilla.good.patterns.challenges.allegro.order.Order;
import com.kodilla.good.patterns.challenges.allegro.user.User;
import com.kodilla.good.patterns.challenges.allegro.product.Product;

public interface OrderRepository {
    boolean createRepository(User user, Product product, Order order);
}
