package com.kodilla.testing.shape;

public class TriangleShape implements Shape {

    String figure;
    double a;
    double h;

    public TriangleShape(String figure, double a, double h) {
        this.figure = this.figure;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName(){
        return "triangle";
    }

    @Override
    public double getField(double a, double h){
        return ((a*h)/2);
    }
}
