package com.kodilla.good.patterns.challenges.modul_9_2.checkers;

import com.kodilla.good.patterns.challenges.modul_9_2.order.Order;

public class PaymentChecker {

    private String comment;

    public String getComment() {
        return comment;
    }

    public boolean checkPayment(Order order){

        boolean payment;

        if (order.getAquiredPayment() == order.getRequiredPayment())
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
            if(order.getAquiredPayment() < 0 || order.getRequiredPayment() < 0)
            {
                comment = "SYSTEM ERROR";
                throw new IncorrectValueException();
            }
            else {
                comment = "No payment acquired.";
            }

            payment = false;

        }

        return payment;
    }
}
