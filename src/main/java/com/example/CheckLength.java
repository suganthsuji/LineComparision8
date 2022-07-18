package com.example;

public class CheckLength {
    CheckLength(double line1, double line2)
    {
        System.out.println("\n Using Equals Method");
        if(Double.toString(line1).equals(Double.toString(line2)))
        {
            System.out.println("Two Lines are Equal");
        }
        else {
            System.out.println("Two Lines are Not Equal");
        }
    }
}
