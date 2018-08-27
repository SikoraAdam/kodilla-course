package com.kodilla.good.patterns.challenges;

public class OrderDto {

    User user;
    boolean isBought;

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
