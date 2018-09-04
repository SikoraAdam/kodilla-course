package com.kodilla.good.patterns.challenges.food2door;

public class OrderCreator {

    private Company company;
    private double totalCost;
    private int orderId;
    private String deliveryAddress;

    OrderDetails orderDetails =
            new OrderDetails(new Company("ExtraFoodShop", "St.Spirit 12", "123456789"),
                    15.20, 123, "St.Coconut 12");

    public Order createOrder()
    {
        company = orderDetails.getCompany();
        totalCost = orderDetails.getTotalCost();
        orderId = orderDetails.getOrderId();
        deliveryAddress = orderDetails.getDeliveryAddress();

        return new Order(company, orderId, deliveryAddress, totalCost);
    }

}
