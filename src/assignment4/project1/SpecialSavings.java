/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 1
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Extends SavingsAccount to implement polymorphic interest rates.
 * If balance exceeds $10,000, interest is calculated at 10%.
 */
package assignment4.project1;

/**
 * Class is a savings account with a unique check when calculating monthly interest
 */
public class SpecialSavings extends SavingsAccount {
	
	/**
	 * Default constructor
	 */
	public SpecialSavings() {
		super(); // Call base constructor
	}
	
	/**
	 * Overload constructor
	 * @param balance initial balance
	 */
	public SpecialSavings(double balance) {
		super(balance); // Call base overload constructor
	}
	
	/**
	 * Calculates account balance after one month with interest.
	 * Checks if account has a balance of over $10,000,
	 * if so, uses 10% interest.
	 */
	@Override
	public void calculateMonthlyInterest() {
		// Checks if account has a balance > $10,000
		if (getBalance() > 10000)
			setBalance(getBalance() + getBalance() * 0.1 / 12);
		else // If not
			super.calculateMonthlyInterest(); // Calls base method
	}
}
