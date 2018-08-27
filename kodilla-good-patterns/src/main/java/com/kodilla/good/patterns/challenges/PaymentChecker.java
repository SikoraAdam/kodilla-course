package com.kodilla.good.patterns.challenges;

public class PaymentChecker {

    Order order;
    String comment;

    public PaymentChecker(Order order) {
        this.order = order;
    }

    public String getComment() {
        return comment;
    }

    public boolean checkPayment(){

        boolean payment;

        if(order.getAquiredPayment() == 0)
        {
            comment = "No payment acquired.";
            payment = false;
        }
        else if (order.getAquiredPayment() < order.getRequiredPayment())
        {
            comment = "Not enough payment acquired.";
            payment = false;
        }
        else if (order.getAquiredPayment() == order.getRequiredPayment())
        {
            comment = "Payment acquired.";
            payment = true;
        }
        else if (order.getAquiredPayment() > order.getRequiredPayment())
        {
            comment = "Payment acquired. Overpayment will be returned on account " + order.getBuyer().getAccountNumber();
            payment = true;
        }
        else
        {
            comment = "SYSTEM ERROR";
            payment = false;
        }

        return payment;
    }
}
