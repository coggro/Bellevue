/*
 * Corey Gross
 * June 28, 2016 
 * Assignment_9_3
 * FileComparison.cs
 * 
 * File Size Comparison
*/

using System;
using System.IO;
using static System.Console;

class FileComparison
{

    static void Main()
    {
        WriteLine(); // Buffer for CLI

        FileInfo txtInfo = new FileInfo("Quote.txt");
        WriteLine("  The .txt file is " + txtInfo.Length + " bytes.");
        double txtLength = Convert.ToDouble(txtInfo.Length); 
    
        FileInfo docxInfo = new FileInfo("Quote.docx");
        WriteLine("  The .docx file is " + docxInfo.Length + " bytes.");
        double docxLength = Convert.ToDouble(docxInfo.Length); 

        double ratio = docxLength/txtLength;
        ratio = Math.Round(ratio, 2, MidpointRounding.AwayFromZero);
        WriteLine("  There are about " + Convert.ToString(ratio) + " bytes"
            + " in the .docx file for every  1 byte in the .txt"
            + "\n  \tfile, or a ratio of 287.75:1 bytes from .docx to "
            + ".txt.");
        
        WriteLine(); // Buffer for CLI
        
    }

}
