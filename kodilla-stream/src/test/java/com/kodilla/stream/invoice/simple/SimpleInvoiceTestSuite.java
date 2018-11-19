package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

    @Test
    public void getValueTest() {
        //Given
        SimpleItem item1 = new SimpleItem(new SimpleProduct("Product 1", 15.00), 1.00);
        SimpleItem item2 = new SimpleItem(new SimpleProduct("Product 2", 15.00), 2.00);
        SimpleItem item3 = new SimpleItem(new SimpleProduct("Product 3", 15.00), 3.00);

        //When
        double result1 = item1.getValue();
        double result2 = item2.getValue();
        double result3 = item3.getValue();

        //Then
        Assert.assertEquals(15.00, result1, 0);
        Assert.assertEquals(30.00, result2, 0);
        Assert.assertEquals(45.00, result3, 0);

    }
}