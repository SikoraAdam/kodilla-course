package com.kodilla.good.patterns.challenges.modul_9_2.order;

import com.kodilla.good.patterns.challenges.modul_9_2.user.User;

public class OrderDto {

    private User user;
    private boolean isBought;

    public OrderDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
