/*
 * Corey Gross
 * May 23, 2016
 * Assignment 4.3
 * InchesToYards.cs
 * 
 * Inches to Yards converter
 * 
 * 
*/

using System;
using static System.Console;

class InchesToYards
{

    public static void Main()
    {
    
        WriteLine(); // Buffer for CLI
        
        int inches = 49;
        ToFeet(inches);
        ToYards(inches);

        WriteLine(); // Buffer for CLI
        
        inches = 98;
        ToFeet(inches);
        ToYards(inches);
        
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

    private static void ToYards(int inchMeasure)
    {
    
        int calcYards = 0;
        int calcFeet = 0;
        int calcInches = inchMeasure;
        
        while (calcInches >= 36)
        {
                
            calcYards += 1;
            calcInches -= 36;
            
        }
        
        while (calcInches >= 12)
        {
                
            calcFeet += 1;
            calcInches -= 12;
            
        }

        Write("  " + inchMeasure + " inches turns into "+ calcYards);
        
        // yard vs yards
        if (calcYards > 1)
            Write(" yards and " + calcFeet);
        else
            Write(" yard and " + calcFeet);

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
