package com.kodilla.testing.shape;

public class SquareShape implements Shape {

    String figure;
    double base;

    public SquareShape(String figure, double base) {
        this.figure = this.figure;
        this.base = base;
    }

    @Override
    public String getShapeName(){
        return "square";
    }

    @Override
    public double getField(){
        return Math.sqrt(base);
    }
}
