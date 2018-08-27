package com.kodilla.good.patterns.challenges.modul_9_2.info_service;

import com.kodilla.good.patterns.challenges.modul_9_2.order.Order;
import com.kodilla.good.patterns.challenges.modul_9_2.checkers.PaymentChecker;
import com.kodilla.good.patterns.challenges.modul_9_2.user.User;

public class MailInformationService implements InformationService {

    private PaymentChecker paymentChecker = new PaymentChecker();

    @Override
    public void informAboutOrder(User user, Order order) {

        System.out.println("Sending mail notification to: " + user.getUserName() + " about order " + order.getOrderId());
        if (paymentChecker.checkPayment(order)) {
            System.out.println(paymentChecker.getComment());
            System.out.println("Order in progress");
        } else {
            System.out.println(paymentChecker.getComment());
            System.out.println("Order waiting for payment.");
        }

        System.out.println("...message sent.");

        System.out.println("---------");
    }
}

