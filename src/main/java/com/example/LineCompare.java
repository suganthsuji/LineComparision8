package com.example;

public class LineCompare {
    public static void main(String[] args)
    {
        System.out.println("----- Welcome to Line Comparison Computation Program -----\n");

        LineCalculation point1_line1= new LineCalculation(2,1);
        LineCalculation point2_line1= new LineCalculation(8,2);

        double line1 = point1_line1.distance(point2_line1);
        System.out.println("Length of First Line : " + line1);

    }
}
