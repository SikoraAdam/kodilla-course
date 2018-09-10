package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPING_TASK = "SHOPPING_TASK";
    public final static String PAINTING_TASK = "PAINTING_TASK";
    public final static String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String theTask)
    {
        switch (theTask) {
            case SHOPPING_TASK:
                return new ShoppingTask("ShoppingTask", "Carrots", 15.2);
            case PAINTING_TASK:
                return new PaintingTask("PaintingTask", "Blue", "Sky");
            case DRIVING_TASK:
                return new DrivingTask("DrivingTask", "Amsterdam", "Car");
                default:
                    throw new RuntimeException();
        }
    }
}
