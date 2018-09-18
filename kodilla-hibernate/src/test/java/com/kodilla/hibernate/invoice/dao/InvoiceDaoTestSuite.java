package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(BigDecimal.valueOf(15.0),3,BigDecimal.valueOf(45.0));
        Item item2 = new Item(BigDecimal.valueOf(30.0),6,BigDecimal.valueOf(180.0));
        Product product1 = new Product("Kapusta");
        Product product2 = new Product("Bomba");
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("Faktura 1/2018");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int productId = invoice.getId();
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(2, invoice.getItems().size());

        //CleanUp
        productDao.delete(productId);
        invoiceDao.delete(invoiceId);

    }
}
