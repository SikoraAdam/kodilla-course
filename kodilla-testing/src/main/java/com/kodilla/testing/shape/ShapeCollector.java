package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    ArrayList<Shape> GeoFigures = new ArrayList<Shape>();
    String figure;
    double a;
    double h;

    public ShapeCollector(Shape shape) {
        this.figure = figure;
        this.a = a;
        this.h = h;
    }

    public void addFigure(Shape shape){
        GeoFigures.add(shape);
    }
    public void removeFigure(Shape shape){
        GeoFigures.remove(shape);
    }
    public Shape getFigure(int n){
        return GeoFigures.get(n);
    }
    public void showFigures(){
        for(int i=0; i<GeoFigures.size(); i++)
        {
            System.out.println(GeoFigures.get(i));
        }
    }

    public int getArraySize(){
        return GeoFigures.size();
    }

}
