package com.kodilla.good.patterns.challenges;

import java.math.*;

public class Product {

    String productName;
    int pruductId;
    double productPrice;

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
