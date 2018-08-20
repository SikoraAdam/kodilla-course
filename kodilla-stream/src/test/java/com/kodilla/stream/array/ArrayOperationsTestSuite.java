package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int tab[] = {1,3,5,7,9};

        //When
        double testAverage = ArrayOperations.getAverage(tab);

        //Then
        Assert.assertEquals(5.0, testAverage, 0.0);
    }
}
