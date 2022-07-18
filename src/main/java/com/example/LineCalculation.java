package com.example;

public class LineCalculation {
    private double x,y;

    LineCalculation(double x1, double y1) {
        x = x1;
        y = y1;
    }
    double distance(LineCalculation p)
    {
        return Math.sqrt( Math.pow(p.x - x,2) + Math.pow(p.y -y,2) );
    }

}
