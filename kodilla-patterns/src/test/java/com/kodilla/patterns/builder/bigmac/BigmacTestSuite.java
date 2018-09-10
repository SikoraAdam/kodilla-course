package com.kodilla.patterns.builder.bigmac;

import org.junit.*;

public class BigmacTestSuite {
    @Test
    public void testBicmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(3)
                .sauce("Spicy")
                .ingredient("Becon")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
