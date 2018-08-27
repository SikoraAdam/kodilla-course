package com.kodilla.good.patterns.challenges;

import java.time.*;

public class OrderSummaryRetriever {

    public OrderSummary retriever(){

        User buyer = new User("Mark1999", "Mark", "Johnson", "St.Michael 19", "m.johnson@mail.com", "1597538426");
        Product product = new Product("Adidas bag", 159, 15.20);
        Order order = new Order(1234, product.getProductPrice(), 16.00, buyer, LocalDate.now());

        return new OrderSummary(buyer, product, order);
    }
}
