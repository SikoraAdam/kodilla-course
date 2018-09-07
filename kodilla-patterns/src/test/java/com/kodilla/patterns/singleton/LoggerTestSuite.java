package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {

    @BeforeClass
    public static void newLog() {
        Logger.getInstance().log("log 1");
    }

    @Test
    public void testNewLog() {
        //Given
        //When
        String newLog = Logger.getInstance().getLastLog();
        System.out.println("New log: " + newLog);
        //Then
        Assert.assertEquals("log 1", newLog);
    }
}
