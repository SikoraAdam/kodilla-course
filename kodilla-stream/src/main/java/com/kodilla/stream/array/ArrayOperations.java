package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        if (numbers.length > 0) {
            IntStream.range(0, numbers.length)
                    .forEach(i -> System.out.println(numbers[i]));

            double optDouble = IntStream.range(0, numbers.length)
                    .map(i -> numbers[i])
                    .average()
                    .orElseThrow(IllegalStateException::new);

            return optDouble;
        }
        else
        {
            throw new IllegalArgumentException("illegal array size");
        }
    }
}
