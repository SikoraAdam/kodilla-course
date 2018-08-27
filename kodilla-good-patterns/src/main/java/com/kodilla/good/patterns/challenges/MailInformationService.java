package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {

    @Override
    public void informAboutOrder(User user, Order order) {
        PaymentChecker paymentChecker = new PaymentChecker(order);
        paymentChecker.checkPayment();

        System.out.println("Sending mail notification to: " + user.getUserName() + " about order " + order.getOrderId());
        System.out.println(paymentChecker.getComment());
        System.out.println("...message sent.");

        System.out.println("---------");
    }
}
