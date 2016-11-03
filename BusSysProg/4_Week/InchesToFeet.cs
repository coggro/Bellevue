/* 
 * Corey Gross
 * May 23, 2016
 * Assignment 4.2
 * InchesToFeet.cs
 * 
 * Inches to feet converter
 * 
*/ 

using System;
using static System.Console;

class InchesToYards
{

    public static void Main()
    {
    
        WriteLine(); // Buffer for CLI
        
        int inches = 13;
        ToFeet(inches);

        WriteLine(); // Buffer for CLI
        
        inches = 26;
        ToFeet(inches);
        
        WriteLine(); // Buffer for CLI
    
    }

    private static void ToFeet(int inchMeasure)
    {
        int calcFeet = 0;
        int calcInches = inchMeasure;

        while (calcInches >= 12)
        {
                
            calcFeet += 1;
            calcInches -= 12;
            
        }

        Write("  " + inchMeasure + " inches turns into "+ calcFeet);
        
        // foot vs feet
        if (calcFeet > 1)
            Write(" feet and " + calcInches);
        else
            Write(" foot and " + calcInches);
        
        // inch vs inches
        if (calcInches > 1)
            Write(" inches.");
        else
            Write(" inch.");
    
        WriteLine();
    
    }

}
