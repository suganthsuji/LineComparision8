package com.example;

public class LineCompare {
    public static void main(String[] args)
    {
        System.out.println("----- Welcome to Line Comparison Computation Program -----\n");

        // Calculating Two Points Using LineCalculation Class
        LineCalculation point1_line1= new LineCalculation(2,1);
        LineCalculation point2_line1= new LineCalculation(8,2);
        double line1 = point1_line1.distance(point2_line1); // Calculating the Distance of the Line using Two points
        System.out.println("Length of First Line : " + line1);

        // Calculating Two Points Using LineCalculation Class
        LineCalculation point1_line2= new LineCalculation(2,0);
        LineCalculation point2_line2= new LineCalculation(5,1);
        double line2 = point1_line2.distance(point2_line2);
        System.out.println("Length of Second Line : " + line2);

        // Creating an Object for CheckLength class to check the length of the lines are Equal or Not
        CheckLength checkLength = new CheckLength(line1,line2);

        // Accessing ComparingLengths function from CheckLength class to check the which line is Greater or Both Lines are Equal
        checkLength.comparingLengths(line1 , line2 );
    }
}
