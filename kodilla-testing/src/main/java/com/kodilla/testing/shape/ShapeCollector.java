package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    ArrayList<Shape> geoFigures = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        geoFigures.add(shape);
    }

    public void removeFigure(Shape shape){
        geoFigures.remove(shape);
    }

    public Shape getFigure(int n){
        return geoFigures.get(n);
    }

    public void showFigures(){
        for(int i = 0; i< geoFigures.size(); i++)
        {
            System.out.println(geoFigures.get(i));
        }
    }

    public int getArraySize(){
        return geoFigures.size();
    }

}
