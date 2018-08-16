package com.kodilla.testing.shape;

public class CircleShape implements Shape {

    String figure;
    double radius;

    public CircleShape(String figure, double radius) {
        this.figure = figure;
        this.radius = radius;
    }

    @Override
    public String getShapeName(){
        return "circle";
    }

    @Override
    public double getField(){
        return Math.PI*Math.sqrt(radius);
    }
}
