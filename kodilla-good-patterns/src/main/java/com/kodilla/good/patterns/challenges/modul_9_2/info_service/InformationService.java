package com.kodilla.good.patterns.challenges.modul_9_2.info_service;

import com.kodilla.good.patterns.challenges.modul_9_2.order.Order;
import com.kodilla.good.patterns.challenges.modul_9_2.user.User;

public interface InformationService {
    void informAboutOrder(User user, Order order);
}