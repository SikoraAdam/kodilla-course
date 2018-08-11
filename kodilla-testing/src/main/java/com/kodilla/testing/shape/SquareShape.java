package com.kodilla.testing.shape;

public class SquareShape implements Shape {

    String figure;
    double a;
    double h;

    public SquareShape(String figure, double a, double h) {
        this.figure = this.figure;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName(){
        return "square";
    }

    @Override
    public double getField(double a, double h){
        return Math.sqrt(a);
    }
}
