import javax.swing.*;

public class ComputeLoanUsingInputDialog_solved {

	public static void main(String[] args) {
		// ENTER ANNUAL INTEREST RATE
		String annualInterestRateString = JOptionPane.showInputDialog("Enter the annual interest rate, for example, 8.25: ");

		// CONVERT STRING TO DOUBLE
		double annualInterestRate = Double.parseDouble(annualInterestRateString);

		// OBTAIN MONTHLY INTEREST RATE
		double monthlyInterestRate = annualInterestRate / 12;

		// ENTER NUMBER OF YEARS
		String numberOfYearString = JOptionPane.showInputDialog("Enter number of years as an integer, for example, 5:");

		// CONVERT STRING TO INT
		int numberOfYears = Integer.parseInt(numberOfYearString);

		// ENTER LOAN AMOUNT
		String loanString = JOptionPane.showInputDialog("Enter loan amount, for example, 120000.95:");

		// CONVERT STRING TO DOUBLE
		double loanAmount = Double.parseDouble(loanString);

		// CALCULATE PAYMENT
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		// FORMAT TO KEEP TWO DIGITS AFTER THE DECIMAL POINT
		monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
		totalPayment = (int) (totalPayment * 100) / 100.0;

		// DISPLAY THE RESULTS
		String output = "The monthly payment is $" + monthlyPayment + "\nThe total payment is $" + totalPayment;
		JOptionPane.showInputDialog(null, output);

	}

}
