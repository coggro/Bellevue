/* 
 * Corey Gross
 * May 10, 2016
 * Assignment 2.3
 * Furniture.cs
 * 
 * Compute the cost of a piece of furniture based on user input.
 * 
*/

using System;
using static System.Console;

public class Furniture
{

    public static void Main(string[] args)
    {
    
        WriteLine(); // Buffer for CLI
        
        Write("  Please choose P for Pine, O for Oak, or M for Mahogany: ");
        string option = ReadLine();
        switch (option)
        {
            case "P":
            case "p":
                WriteLine("  A Pine table costs $100.");
                break;
            case "O":
            case "o":
                WriteLine("  An Oak table costs $225.");
                break;
            case "M":
            case "m":
                WriteLine("  A Mahogany table costs $310.");
                break;
            default:
                WriteLine("  A table made of no wood costs $0");
                break;
        }
        
        WriteLine(); // Buffer for CLI
    
    }

}
