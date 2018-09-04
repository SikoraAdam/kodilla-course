package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private Company company;
    private double totalCost;
    private int orderId;
    private String address;
    AvailableCompanies availableCompanies;

    public Order(Company company, int orderId, String address, double totalCost) {
        this.company = company;
        this.orderId = orderId;
        this.totalCost = totalCost;
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalCost() { return totalCost; }

    public String getAddress() {
        return address;
    }

    public AvailableCompanies getAvailableCompanies() {
        return availableCompanies;
    }

    public enum AvailableCompanies
    {
        EXTRA_FOOD_SHOP,

        HEALTHY_SHOP,

        GLUTEN_FREE_SHOP
    }

}
