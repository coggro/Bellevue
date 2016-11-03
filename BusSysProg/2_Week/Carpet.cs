/* 
 * Corey Gross
 * May 10, 2016
 * Assignment 2.2
 * Carpet.cs
 * 
 * Compute the cost of carpeting a room
 * 
*/ 

using System;
using static System.Console;

public class Carpet
{

    public static void Main(string[] args)
    {
    
        WriteLine(); // Buffer for CLI
        
        float width = 30.3F; // width of room
        float length = 20.5F; // length of room
        float cost = 1.50F; // cost of carpet per unit of measure
        
        WriteLine("  If the room is {0} feet wide, {1} feet long, ", width, length);
        WriteLine("  and carpet costs {0} per square foot, the room", cost.ToString("C"));
        WriteLine("  will cost {0} to carpet.", (width*length*cost).ToString("C"));

        WriteLine(); // Buffer for CLI
    
    }

}
