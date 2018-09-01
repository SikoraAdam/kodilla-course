package com.kodilla.good.patterns.challenges.allegro.order;

import com.kodilla.good.patterns.challenges.allegro.user.User;

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
