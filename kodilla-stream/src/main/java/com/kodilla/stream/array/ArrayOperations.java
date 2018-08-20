package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();

        OptionalDouble optDouble = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();

        return optDouble.getAsDouble();
    }
}
