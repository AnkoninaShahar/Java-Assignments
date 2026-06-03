/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 1
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Tests SavingsAccount and SpecialSavings functionality.
 * Demonstrates static variable updates and polymorphism.
 */

/* Design
   1. Variables:
      - saver1, saver2 (SavingsAccount): Test objects for standard and special logic.
      - annualInterestRate (static double): Interest rate shared by all accounts.
      - savingsBalance (double): Current balance of an individual account.
      - prevBalance1, prevBalance2 (double): Used to calculate interest earned in output.

   2. Input:
      - Initial balances are hardcoded as $2000 and $3000.
      - Interest rates are updated to 4% and 5%.
      - Deposits and withdrawals are performed to push balances past $10,000.

   3. Processing:
      - instantiate SavingsAccount objects and apply monthly interest at 4% and 5%.
      - instantiate SpecialSavings objects and test overriding calculateMonthlyInterest().
      - Use deposit() and withdraw() to adjust balances.

   4. Output:
      - print() displays account snapshots with formatted currency.
      - Final summary shows new balances and specific interest earned amounts.
*/
package assignment4.project1;

/**
 * Class to test savings accounts
 */
public class SavingsDriver {

	// Start of program
	public static void main(String[] args) {
		
		// SAVINGS ACCOUNT TESTS
		// _______________________________________________
		
		// Instantiates 2 savings accounts at $2000 and $3000 respectively
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04); // Sets interest to 4%

		// Test for regular savings accounts
		System.out.printf("===========================\n"
						+ "SAVINGS ACCOUNT TESTS\n"
						+ "===========================\n\n");
		
		// Before interest is applied
		System.out.printf("BEFORE INTEREST\n"
						+ "-----\n");
		System.out.printf("SAVER 1:\n");
		saver1.print();
		System.out.printf("SAVER 2:\n");
		saver2.print();
			
		// Calculates new balance after interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// After 4% interest
		System.out.printf("\n\n4%% INTEREST\n"
						+ "-----\n");
		System.out.printf("SAVER 1:\n");
		saver1.print();
		System.out.printf("SAVER 2:\n");
		saver2.print();
		
		SavingsAccount.modifyInterestRate(0.05); // Sets interest rate to 5%
		
		// Calculates new balance after interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// After 5% interest
		System.out.printf("\n\n5%% INTEREST\n"
						+ "-----\n");
		System.out.printf("SAVER 1:\n");
		saver1.print();
		System.out.printf("SAVER 2:\n");
		saver2.print();
		
		// SPECIAL SAVINGS TESTS
		// _______________________________________________
		
		// Instantiates 2 special savings accounts at $2000 and $3000 respectively
		saver1 = new SpecialSavings(2000);
		saver2 = new SpecialSavings(3000);
		
		// Withdraw and deposit test for the accounts
		saver1.withdraw(1500);
		saver2.deposit(8500);
		
		// Storing the balance before interest to calculate interest gain later
		double prevBalance1 = saver1.getBalance();
		double prevBalance2 = saver2.getBalance();
		 
		SavingsAccount.modifyInterestRate(0.04); // Sets interest rate to 4%
		
		// Test for special savings accounts
		System.out.printf("\n\n===========================\n"
						+ "SPECIAL SAVINGS TESTS\n"
						+ "===========================\n\n");
		
		// Before interest is applied
		System.out.printf("BEFORE INTEREST\n"
						+ "-----\n");
		System.out.printf("SAVER 1:\n");
		saver1.print();
		System.out.printf("SAVER 2:\n");
		saver2.print();
		
		// Calculates new balance after interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// After 4% interest
		System.out.printf("\nAFTER INTEREST\n"
						+ "-----\n");
		System.out.printf("===========================\n"
						+ "Saver 1:\n"
						+ "    Balance: $%.2f\n"
						+ "    Interest: $%.2f\n\n"
						+ "Saver 2:\n"
						+ "    Balance: $%.2f\n"
						+ "    Interest: $%.2f\n\n"
						+ "===========================\n", 
						saver1.getBalance(), saver1.getBalance() - prevBalance1, 
						saver2.getBalance(), saver2.getBalance() - prevBalance2);
		
	}

}

/* TEST RUN
===========================
SAVINGS ACCOUNT TESTS
===========================

BEFORE INTEREST
-----
SAVER 1:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $2000.00
===========================
SAVER 2:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $3000.00
===========================


4% INTEREST
-----
SAVER 1:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $2006.67
===========================
SAVER 2:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $3010.00
===========================


5% INTEREST
-----
SAVER 1:
===========================
Annual Interest Rate: 5.00%
Savings Balance: $2015.03
===========================
SAVER 2:
===========================
Annual Interest Rate: 5.00%
Savings Balance: $3022.54
===========================


===========================
SPECIAL SAVINGS TESTS
===========================

BEFORE INTEREST
-----
SAVER 1:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $500.00
===========================
SAVER 2:
===========================
Annual Interest Rate: 4.00%
Savings Balance: $11500.00
===========================

AFTER INTEREST
-----
===========================
Saver 1:
    Balance: $501.67
    Interest: $1.67

Saver 2:
    Balance: $11595.83
    Interest: $95.83

===========================

*/