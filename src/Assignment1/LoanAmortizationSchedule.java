/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 1, Project 1
 * Due Date: 04/26/2026
 * Date Submitted: 04/22/2026
 *
 * Description: Takes in a loan amount, time frame, 
 * 				and interest rate and calculates the 
 * 				balance over that given number of years
 */
package Assignment1;

import java.util.Scanner;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {
		// Initializing input variables
		double loanAmount = 0.0, annualInterestRate = 0.0;
		int numberOfYears = 0;
		
		Scanner in = new Scanner(System.in); // Scanner that takes inputs
		
		// Prompts user for and stores inputs 
		// (loan amount, number of years, interest rate)
		//____________________________________________________________
		
		System.out.printf("Enter the loan amount: ");
		loanAmount = in.nextDouble();
		
		System.out.printf("Enter number of years: ");
		numberOfYears = in.nextInt();
		
		System.out.printf("Enter annual interest rate: ");
		annualInterestRate = in.nextDouble();
		//____________________________________________________________

		
		// Convert the annual rate from a percentage to a decimal
		annualInterestRate = annualInterestRate / 100.0;

		// Compute the monthly interest rate
		double monthlyInterestRate = annualInterestRate / 12.0;

		// Compute the total number of monthly payments
		int n = numberOfYears * 12;

		// Compute the fixed monthly payment
		double monthlyPayment = computeMonthlyPayment(loanAmount, monthlyInterestRate, n);

		// Compute the total amount paid over all months
		double totalPayment = monthlyPayment * n;
		
		// Prints values
		System.out.printf("\nMonthly Payment:\t\t%.2f", monthlyPayment);
		System.out.printf("\nTotal Payment:\t\t%.2f", totalPayment);
		
		// Loops over every month and calculates the current balance
		//______________________________________________________________
		
		System.out.printf("\n\nPayment#\t\tInterest\t\tPrincipal\tBalance\n"); // Prints header
		double balance = loanAmount;
		for (int i = 1; i <= n; i++) {
			// Calculates monetary values
		    double interest = monthlyInterestRate * balance;
		    double principal = monthlyPayment - interest;
		    
		    // Checks if the last balance will be greater than zero
		    if (i == n && balance - principal > 0) {
		    	// If so, adds the final balance to payment and zero's out balance
		    	principal += balance - principal;
		    	balance = 0;
		    }
		    else {
		    	// If not, continue as usual
		    	balance = balance - principal;
		    }
		    
		    System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f%n", i, interest, principal, balance); // Prints a row
		}
		//______________________________________________________________

		in.close(); // Closes scanner

	}
	
	/**
	 * Calculates the monthly payment for the loan
	 * @param loanAmount			: Amount of money loaned from the bank
	 * @param monthlyInterestRate	: Interest rate per month
	 * @param n						: Number of monthly payments
	 * @return Payment amount required per month due to interest
	 */
	public static double computeMonthlyPayment(double loanAmount, double monthlyInterestRate, int n) {
		return (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, n))
                / (Math.pow(1 + monthlyInterestRate, n) - 1);
	}

}
