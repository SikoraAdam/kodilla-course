package com.kodilla.good.patterns.challenges;

public class ItemOrderService implements OrderService {
    @Override
    public boolean handleOrder(Order order) {

        PaymentChecker paymentChecker = new PaymentChecker(order);

        if(paymentChecker.checkPayment())
        {
            System.out.println("Order " + order.getOrderId() + " from " + order.getDateOfOrder() + " ordered by " + order.getBuyer().getUserName() + " is ready to be sent.");
        }
        else
            System.out.println("Order " + order.getOrderId() + " from " + order.getDateOfOrder() + " ordered by " + order.getBuyer().getUserName() + " is waiting for payment");

        System.out.println("---------");

        return true;
    }
}
