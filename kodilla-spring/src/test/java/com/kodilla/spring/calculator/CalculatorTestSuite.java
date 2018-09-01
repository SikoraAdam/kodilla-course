package com.kodilla.spring.calculator;


import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double adding = calculator.add(6,5);
        double subing = calculator.sub(6,5);
        double muling = calculator.mul(6,5);
        double diving = calculator.div(6,5);
        //Then
        Assert.assertEquals(11.0, adding, 0.0);
        Assert.assertEquals(1.0, subing, 0.0);
        Assert.assertEquals(30.0, muling, 0.0);
        Assert.assertEquals(1.2, diving, 0.0);
    }
}
