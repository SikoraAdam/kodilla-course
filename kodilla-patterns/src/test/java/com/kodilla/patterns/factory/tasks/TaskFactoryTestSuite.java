package com.kodilla.patterns.factory.tasks;

import org.junit.*;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task drivingTask = task.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("DrivingTask", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task paintingTask = task.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("PaintingTask", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shoppingTask = task.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("ShoppingTask", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
