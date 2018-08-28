package com.kodilla.good.patterns.challenges.allegro.info.service;

import com.kodilla.good.patterns.challenges.allegro.order.Order;
import com.kodilla.good.patterns.challenges.allegro.checkers.PaymentChecker;
import com.kodilla.good.patterns.challenges.allegro.user.User;

public class MailInformationService implements InformationService {

    private PaymentChecker paymentChecker = new PaymentChecker();

    @Override
    public void informAboutOrder(User user, Order order) {

        boolean paymentStatus = paymentChecker.checkPayment(order);

        System.out.println("Sending mail notification to: " + user.getUserName() + " about order " + order.getOrderId());
        System.out.println(paymentChecker.getComment());
        if (paymentStatus) {
            System.out.println("Order in progress");
        } else {
            System.out.println("Order waiting for payment.");
        }

        System.out.println("...message sent.");

        System.out.println("---------");
    }
}

