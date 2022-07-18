package com.example;

class LineCalculation
{
    private double x,y;

    /*
    A Constructor to assign two coordinates to x and y
     */
    LineCalculation(double x1, double y1) {
        x = x1;
        y = y1;
    }
    /*
    Function Distance with Return type Double is used find the distance of two points
     */
    double distance(LineCalculation p)
    {
        return Math.sqrt( Math.pow(p.x - x,2) + Math.pow(p.y -y,2) );
    }
}


