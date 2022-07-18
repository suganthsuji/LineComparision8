package com.example;

class CheckLength extends UsingCompareToMethod
{
    /*
    An Argument Constructor to check two lines are Equal
     */
    CheckLength(double line1, double line2)
    {
        System.out.println("\nUsing Equals Method");
        if(Double.toString(line1).equals(Double.toString(line2)))
        {
            System.out.println("Two Lines are Equal");
        }
        else {
            System.out.println("Two Lines are Not Equal");
        }
    }
}

class UsingCompareToMethod
{
    /*
    A Function to use CompareTo built-in method to check which line is Greater or Lesser or Both are Equal
     */
    void comparingLengths(double line1 , double line2)
    {
        System.out.println("\nUsing CompareTo Method");
        int value = (Double.toString(line1).compareTo(Double.toString(line2)));
        if(value >= 1)
        {
            System.out.println("Line 1 is Greater");
        }
        else if (value < 0 )
        {
            System.out.println("Line 2 is Greater");
        }
        else
        {
            System.out.println("Lines are Equal");
        }
    }
}
