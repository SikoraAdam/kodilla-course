package com.kodilla.good.patterns.challenges.allegro.info.service;

import com.kodilla.good.patterns.challenges.allegro.order.Order;
import com.kodilla.good.patterns.challenges.allegro.user.User;

public interface InformationService {
    void informAboutOrder(User user, Order order);
}