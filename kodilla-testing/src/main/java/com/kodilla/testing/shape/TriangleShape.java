package com.kodilla.testing.shape;

public class TriangleShape implements Shape {

    String figure;
    double base;
    double height;

    public TriangleShape(String figure, double base, double height) {
        this.figure = figure;
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName(){
        return "triangle";
    }

    @Override
    public double getField(){
        return ((base * height)/2);
    }
}
