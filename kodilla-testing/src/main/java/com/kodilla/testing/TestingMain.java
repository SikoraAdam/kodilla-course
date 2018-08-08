package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator testPair = new Calculator(15, 25);
        int adding = testPair.add();
        int substracting = testPair.substract();

        if (adding == 40)
        {
            System.out.println("Test OK");
        }
        else
        {
            System.out.println("Test not OK");
        }

        if (substracting == -10)
        {
            System.out.println("Test OK");
        }
        else
        {
            System.out.println("Test not OK");
        }
    }
}
