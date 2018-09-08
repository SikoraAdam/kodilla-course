package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.companies.AvailableCompanies;
import com.kodilla.good.patterns.challenges.food2door.companies.Company;

public class Order {

    private Company company;
    private double totalCost;
    private int orderId;
    private String address;
    private AvailableCompanies availableCompanies;

    public Order(Company company, int orderId, String address, double totalCost, AvailableCompanies availableCompanies) {
        this.company = company;
        this.orderId = orderId;
        this.totalCost = totalCost;
        this.address = address;
        this.availableCompanies = availableCompanies;
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



}
