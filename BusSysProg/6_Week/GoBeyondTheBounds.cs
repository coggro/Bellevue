using System;
using static System.Console;

class GoBeyondTheBounds
{

    public static void Main()
    {
    
        int[] fiveInts = {1, 2, 3, 4, 5};
        
        try
        {
            for (int i = 0; i <= 10; i++)
            {
    
                WriteLine(fiveInts[i]);
    
            }
        }

        catch (IndexOutOfRangeException)
        {
    
         WriteLine("  Now you've gone beyond the bounds of the array.");
    
        }
        
    }

}
