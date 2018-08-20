package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        List<Integer> theNumbersList = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            theNumbersList.add(numbers[i]);
        }

        IntStream.range(0, theNumbersList.size());


        System.out.println(IntStream.range(0, numbers[numbers.length]));
        System.out.println(IntStream.range(numbers[0], numbers[numbers.length]).average());

        return IntStream.range(numbers[0], numbers[numbers.length]).average().getAsDouble();
    };
}
