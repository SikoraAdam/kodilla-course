package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite
{
    @Before
    public void before()
    {
        System.out.println("Test: begin");
    }
    @After
    public void after()
    {
        System.out.println("Test: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList ()
    {
        //Given
        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        ArrayList<Integer> testEmptyArrayList = new ArrayList<Integer>();

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //Then
        Assert.assertEquals(exterminator.exterminate(testArrayList), testEmptyArrayList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList ()
    {
        //Given
        ArrayList<Integer> testArrayListAllNumbers = new ArrayList<Integer>();
        ArrayList<Integer> testArrayListOddNumbers = new ArrayList<Integer>();

        for(int i = 0; i<10; i++)
        {
            testArrayListAllNumbers.add(i);
        }

        for (int odd : testArrayListAllNumbers)
        {
            if(odd%2 ==0)
            {
                testArrayListOddNumbers.add(odd);
            }
        }

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //Then
        Assert.assertEquals(exterminator.exterminate(testArrayListAllNumbers), testArrayListOddNumbers);
    }
}
