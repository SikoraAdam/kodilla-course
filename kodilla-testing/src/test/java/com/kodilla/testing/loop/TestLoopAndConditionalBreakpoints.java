package com.kodilla.testing.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        // Given
        long sum = 0L;
        // When
        for (int n = 0; n < 1000; n++) {
            sum += n;
            System.out.printf("[%d] Sum equals: %d\n", n, sum);
        }
        // Then
        assertEquals(499500, sum);
    }
}
