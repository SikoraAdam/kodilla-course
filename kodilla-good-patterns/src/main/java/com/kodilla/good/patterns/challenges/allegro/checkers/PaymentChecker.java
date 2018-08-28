package com.kodilla.good.patterns.challenges.allegro.checkers;

import com.kodilla.good.patterns.challenges.allegro.order.Order;

public class PaymentChecker {

    private String comment;
    private static final int NO_PAYMENT = 0;

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
            if(order.getAquiredPayment() < NO_PAYMENT || order.getRequiredPayment() < NO_PAYMENT)
            {
                throw new IncorrectValueException("SYSTEM ERROR");
            }
            else {
                comment = "No payment acquired.";
            }

            payment = false;

        }

        return payment;
    }
}
