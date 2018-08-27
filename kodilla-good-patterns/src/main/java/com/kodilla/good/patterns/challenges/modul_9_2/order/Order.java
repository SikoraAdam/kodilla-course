package com.kodilla.good.patterns.challenges.modul_9_2.order;

import com.kodilla.good.patterns.challenges.modul_9_2.user.User;

import java.time.*;

public class Order {

    private int orderId;
    private double requiredPayment;
    private double aquiredPayment;
    private User buyer;
    private LocalDate dateOfOrder;

    public Order(int orderId, double requiredPayment, double aquiredPayment, User buyer, LocalDate dateOfOrder) {
        this.orderId = orderId;
        this.requiredPayment = requiredPayment;
        this.aquiredPayment = aquiredPayment;
        this.buyer = buyer;
        this.dateOfOrder = dateOfOrder;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getRequiredPayment() {
        return requiredPayment;
    }

    public double getAquiredPayment() { return aquiredPayment; }

    public User getBuyer() {
        return buyer;
    }

    public LocalDate getDateOfOrder() { return dateOfOrder; }
}
