package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int givenArray[] = {10,20,30,40,50,60,71,80,90,91};
        double givenArrayAverage = ArrayOperations.getAverage(givenArray);

        //When
        int testingArray[] = {10,20,30,40,50,60,71,80,90,91};
        double expectedAverage = ArrayOperations.getAverage(testingArray);

        //Then
        Assert.assertEquals(54.20, expectedAverage, 0.0);
    }
}
