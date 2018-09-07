package com.kodilla.good.patterns.challenges.food2door;

public class OrderDetails {
    private Company company;
    private double totalCost;
    private int orderId;
    private String deliveryAddress;
    private AvailableCompanies availableCompanies;

    public OrderDetails() {
        this.company = new Company("ExtraFoodShop", "St.Spirit 12", "123456789");
        this.totalCost = 15.20;
        this.orderId = 123;
        this.deliveryAddress = "St.Coconut 12";
        this.availableCompanies = AvailableCompanies.GLUTEN_FREE_SHOP;
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public AvailableCompanies getAvailableCompanies() {
        return availableCompanies;
    }
}
