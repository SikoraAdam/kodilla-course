package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        SquareShape square = new SquareShape("square", 10.0);
        ShapeCollector newShape = new ShapeCollector(square);

        //When
        newShape.addFigure(square);

        //Then
        Assert.assertEquals(1, newShape.getArraySize());
    }

    @Test
    public void testRemoveShape() {
        //Given
        SquareShape square = new SquareShape("square", 10.0);
        ShapeCollector newShape = new ShapeCollector(square);

        newShape.addFigure(square);

        //When
        newShape.removeFigure(square);

        //Then
        Assert.assertEquals(0, newShape.getArraySize());
    }

    @Test
    public void testGetShape() {
        //Given
        SquareShape square = new SquareShape("square", 10.0);
        ShapeCollector newShape = new ShapeCollector(square);

        newShape.addFigure(square);

        //When
        SquareShape testerShape;
        testerShape = (SquareShape)newShape.getFigure(0);

        //Then
        Assert.assertEquals(testerShape, square);
    }
}
