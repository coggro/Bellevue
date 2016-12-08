import javax.swing.*;
import java.awt.*;

public class Exponent
{

	public static void main(String[] args)
	{
		
		Exponent exp = new Exponent();

		double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a double value. Example: 32.01"));
		
		JOptionPane.showMessageDialog(null, "Number: " + input + "\nSquare: " + exp.square(input) + "\nCube: " + exp.cube(input));
	}

	public double square(double num)
	{
	
		return num * num;

	}

	public double cube(double num)
	{

		return num * num * num;

	}

}
