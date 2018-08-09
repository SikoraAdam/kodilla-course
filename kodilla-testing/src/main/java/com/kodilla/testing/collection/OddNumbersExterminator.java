package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator
{
    ArrayList<Integer> testArrayList = new  ArrayList<Integer>();
    ArrayList<Integer> finalArrayList = new  ArrayList<Integer>();

    public OddNumbersExterminator(ArrayList<Integer> testArrayList)
    {
        this.testArrayList = testArrayList;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i)%2==0)
            {
                finalArrayList.add(numbers.get(i));
            }
        }
        return finalArrayList;
    }
}
