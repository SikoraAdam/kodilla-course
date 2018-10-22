package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Middle size pizza", description);
    }

    @Test
    public void testPizzaAddMeatGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddMeatPizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(29), cost);
    }


    @Test
    public void testPizzaAddMeatGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddMeatPizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Middle size pizza, additional meat", description);
    }

    @Test
    public void testPizzaAddMeatExtraCheeseRyeDoughGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddMeatPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new RyeDoughPizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Middle size pizza, additional meat, extra cheese, rye dough", description);
    }

    @Test
    public void testPizzaAddMeatExtraCheeseRyeDoughGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddMeatPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new RyeDoughPizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(34), cost);
    }
}
