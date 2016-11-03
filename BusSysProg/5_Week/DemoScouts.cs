/* 
 * Corey Gross
 * May 30, 2016
 * Assignment 5.2
 * DemoScouts.cs
 * 
 * Girl Scout Object Demo
 * 
*/

using System;
using static System.Console;

class DemoScouts
{

    public static void Main()
    {
    
        GirlScout defaultScout = new GirlScout();
        GirlScout customScout = new GirlScout("Abby", "244", 16.43F);

        WriteLine(); // Buffer for CLI
        
        defaultScout.displayInformation();
       
        WriteLine(); // Buffer for CLI

        customScout.displayInformation();
        
        WriteLine(); // Buffer for CLI
        
        WriteLine("  This is a standalone motto reading. No scout involved.");
        WriteLine("  " + GirlScout.MOTTO);

        WriteLine(); // Buffer for CLI

    }

}

class GirlScout
{

    private string name {get; set;}
    private string troopNumber {get; set;}
    private float duesOwed {get; set;}
    public const string MOTTO = "to obey the Girl Scout law";

    public GirlScout()
    {
    
        name = "Default Girl Scout";
        troopNumber = "000";
        duesOwed = 20.00F;
    
    }

    public GirlScout(string n, string t, float d)
    {
    
        name = n;
        troopNumber = t;
        duesOwed = d;
    
    }

    public void displayInformation()
    {
        
        WriteLine("  Incoming Scout!");
        WriteLine("  Name:         " + name);
        WriteLine("  Troop Number: " + troopNumber);
        WriteLine("  Dues Owed:    " + duesOwed.ToString("C2"));
        WriteLine("  Motto:        " + MOTTO);

    }

}
