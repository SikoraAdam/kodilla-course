package com.kodilla.good.patterns.challenges.allegro.order;

import com.kodilla.good.patterns.challenges.allegro.checkers.PaymentChecker;

public class ItemOrderService implements OrderService {

    private PaymentChecker paymentChecker = new PaymentChecker();

    @Override
    public boolean handleOrder(Order order) {

        if(paymentChecker.checkPayment(order))
        {
            System.out.println("Order " + order.getOrderId() + " from " + order.getDateOfOrder() + " ordered by " + order.getBuyer().getUserName() + " is ready to be sent.");
        }
        else {
            System.out.println("Order " + order.getOrderId() + " from " + order.getDateOfOrder() + " ordered by " + order.getBuyer().getUserName() + " is waiting for payment");
        }

        System.out.println("---------");

        return true;
    }
}
