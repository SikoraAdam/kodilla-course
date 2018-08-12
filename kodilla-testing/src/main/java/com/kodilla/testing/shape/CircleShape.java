package com.kodilla.testing.shape;

public class CircleShape implements Shape {

    String figure;
    double a;
    double h;

    public CircleShape(String figure, double a, double h) {
        this.figure = this.figure;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName(){
        return "circle";
    }

    @Override
    public double getField(double a, double h){
        return Math.PI*Math.sqrt(a);
    }
}