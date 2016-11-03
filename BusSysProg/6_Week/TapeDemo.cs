using System;
using static System.Console;

class DemoTape
{
    public static void Main()
    {
        
        /* 
         * Each of these blocks uses a default constructor, then a
         * constructor with invalid data in all arguments, and then
         * invalid arguments in length and then width arguments to prove
         * that all of my constructors and assignment properties work right.
        */

        WriteLine("---------------------------------------------------");
        WriteLine("Tape Objects");
        WriteLine("---------------------------------------------------");
        Tape blankTestTape = new Tape();
        WriteLine(blankTestTape.ToString());
        Tape fullErrorTestTape = new Tape(42, 42);
        WriteLine(fullErrorTestTape.ToString());
        Tape backErrorTestTape = new Tape(42, 4);
        WriteLine(backErrorTestTape.ToString());
        Tape frontErrorTestTape = new Tape(4, 42);
        WriteLine(frontErrorTestTape.ToString());

        WriteLine("---------------------------------------------------");
        WriteLine("VideoTape Objects");
        WriteLine("---------------------------------------------------");
        VideoTape blankTestVTape = new VideoTape();
        WriteLine(blankTestVTape.ToString());
        VideoTape fullErrorTestVTape = new VideoTape(42, 42, 200);
        WriteLine(fullErrorTestVTape.ToString());
        VideoTape backErrorTestVTape = new VideoTape(42, 4, 90);
        WriteLine(backErrorTestVTape.ToString());
        VideoTape frontErrorTestVTape = new VideoTape(4, 42, 90);
        WriteLine(frontErrorTestVTape.ToString());
    
        WriteLine("---------------------------------------------------");
        WriteLine("AdhesiveTape Objects");
        WriteLine("---------------------------------------------------");
        AdhesiveTape blankTestATape = new AdhesiveTape();
        WriteLine(blankTestATape.ToString());
        AdhesiveTape fullErrorTestATape = new AdhesiveTape(42, 42, 42);
        WriteLine(fullErrorTestATape.ToString());
        AdhesiveTape backErrorTestATape = new AdhesiveTape(42, 4, 4);
        WriteLine(backErrorTestATape.ToString());
        AdhesiveTape frontErrorTestATape = new AdhesiveTape(4, 42, 4);
        WriteLine(frontErrorTestATape.ToString());
    
    }
}

public class Tape
{
   
    /*
     * storing the length value in _length allows me to recursively validate and set the value
     * without throwing a giant StackOverflowException
    */

    private int _length; 
    public int length    
    {    
        get
        {
            return _length;
        }
    
        set
        {
            if(value >= 1 && value <= 10)
            {
                _length = value;
            } else {
                WriteLine("  " + value + " is an invalid length value. Reset to 1.");
                WriteLine("    Proper values are between 1 and 10, inclusive.");
                _length = 1;
            }
        
        }
    
    }
    
    private int _width;
    public int width    
    {    
        get
        {
            return _width;
        }
    
        set
        {
            if(value >= 1 && value <= 10)
            {
                _width = value;
            } else {
                WriteLine("  " + value + " is an invalid width value. Reset to 1.");
                WriteLine("    Proper values are between 1 and 10, inclusive.");
                _width = 1;
            }
        
        }
    
    }

    public Tape()
    {
        length = 5;
        width = 5;
    }
        
    public Tape(int l, int w)
    {
        length = l;
        width = w;
    }

    public override string ToString()
    {
        return("  " + GetType() + ": " + length + "x" + width + "\n\n");
    }
    
}

public class VideoTape : Tape
{

    private int _playtime;   
    public int playtime    
    {    
        get
        {
            return _playtime;
        }
    
        set
        {
            if(value >= 1 && value <= 180)
            {
                _playtime = value;
            } else {
                WriteLine("  " + value + " is an invalid playtime value. Reset to 1.");
                WriteLine("    Proper values are between 1 and 180, inclusive.");
                _playtime = 1;
            }
        
        }
    
    }
    
    public VideoTape()
    {
        length = 5;
        width = 5;
        playtime = 90;
    }

    public VideoTape(int l, int w, int p)
    {
        length = l;
        width = w;
        playtime = p;
    }

    public override string ToString()
    {
        return("  " + GetType() + ": " + length + "x" + width + " | Playtime: " + playtime + "\n\n");
    }

}

public class AdhesiveTape : Tape
{

    private int _stickiness;   
    public int stickiness    
    {    
        get
        {
            return _stickiness;
        }
    
        set
        {
            if(value >= 1 && value <= 10)
            {
                _stickiness = value;
            } else {
                WriteLine("  " + value + " is an invalid stickiness value. Reset to 1.");
                WriteLine("    Proper values are between 1 and 10, inclusive.");
                _stickiness = 1;
            }
        
        }
    
    }
    
    public AdhesiveTape()
    {
        length = 5;
        width = 5;
        stickiness = 5;
    }

    public AdhesiveTape(int l, int w, int s)
    {
        length = l;
        width = w;
        stickiness = s;
    }
    
    public override string ToString()
    {
        return("  " + GetType() + ": " + length + "x" + width + " | Stickiness: " + stickiness + "\n\n");
    }

}

