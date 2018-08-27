package com.kodilla.good.patterns.challenges;

import java.time.*;

public class Order {

    int orderId;
    double requiredPayment;
    double aquiredPayment;
    User buyer;
    LocalDate dateOfOrder;

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
