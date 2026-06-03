/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 1
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Defines a SavingsAccount class with a static interest rate.
 * Includes methods for monthly interest calculation and updating the rate.
 * Uses protected accessors to allow subclass access while maintaining encapsulation.
 */
package assignment4.project1;

/**
 * Class that tracks a global annual interest rate and an instance specific balance
 */
public class SavingsAccount {
	
	private static double annualInterestRate = 0.0; // Global static interest rate
	private double savingsBalance = 0.0; // Balance in an account
	
	/**
	 * Default Constructor
	 */
	public SavingsAccount() {
		savingsBalance = 0.0;
	}
	
	/**
	 * Overload constructor
	 * @param savingsBalance initial balance in account
	 */
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	/**
	 * Calculates the new balance after one month
	 */
	public void calculateMonthlyInterest() {
		savingsBalance += savingsBalance * annualInterestRate / 12;
	}
	
	/**
	 * Sets the interest rate
	 * @param rate new interest rate
	 */
	public static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	/**
	 * Sets the balance
	 * @param balance new balance
	 */
	protected void setBalance(double balance) {
		savingsBalance = balance;
	}
	
	/**
	 * Retrieves the balance
	 * @return the current balance
	 */
	protected double getBalance() {
		return savingsBalance;
	}
	
	/**
	 * Adds funds into account balance
	 * @param amount the amount that is added
	 */
	public void deposit(double amount) {
		savingsBalance += amount;
	}
	
	/**
	 * Removes funds from account balance
	 * @param amount the amount that is removed
	 */
	public void withdraw(double amount) {
		savingsBalance -= amount;
	}
	
	/**
	 * Prints the account info (interest and balance)
	 */
	public void print() {
		System.out.printf("===========================\n"
						+ "Annual Interest Rate: %.2f%%\n"
						+ "Savings Balance: $%.2f\n"
						+ "===========================\n", 
						annualInterestRate * 100, savingsBalance);
	}
}
