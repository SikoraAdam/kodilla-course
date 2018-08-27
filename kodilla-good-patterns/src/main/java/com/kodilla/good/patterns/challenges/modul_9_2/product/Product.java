package com.kodilla.good.patterns.challenges.modul_9_2.product;

public class Product {

    private String productName;
    private int pruductId;
    private double productPrice;

    public Product(String productName, int pruductId, double productPrice) {
        this.productName = productName;
        this.pruductId = pruductId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getPruductId() {
        return pruductId;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
