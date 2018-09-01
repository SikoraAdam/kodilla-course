package com.kodilla.good.patterns.challenges.food2door;

public class Company {

    private String name;
    private String address;
    private String NIP;

    public Company(String name, String address, String NIP) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNIP() {
        return NIP;
    }
}
