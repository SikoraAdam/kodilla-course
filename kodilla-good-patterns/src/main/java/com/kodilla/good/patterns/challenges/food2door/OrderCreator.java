package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    private Company company;
    private double totalCost;
    private int orderId;
    private String address;

    public Order createOrder()
    {
        company = new Company("ExtraFoodShop", "St.Spirit 12", "123456789");
        totalCost = 15.20;
        orderId = 123;
        address = "St.Coconut 12";

        return new Order(company, orderId, address, totalCost);
    }

    public Company getCompany() {
        return company;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getAddress() {
        return address;
    }
}
