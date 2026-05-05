/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 1, Project 2
 * Due Date: 04/26/2026
 * Date Submitted: 04/22/2026
 *
 * Description: Take in a positive integer and 
 * 				approximate the square root of the number.
 * 				Then it will calculate the exact square root.
 */
package assignment1;

import java.util.Scanner;

public class ApproximateSquareRoot {

	public static void main(String[] args) {
		long n = 0; // Initializes input variable
		
		Scanner in = new Scanner(System.in); // Scanner that takes inputs
		
		// Prompts user for and stores positive integer
		System.out.printf("Enter a positive integer: ");
		n = in.nextLong();
		
		double approximate = sqrt(n); // Calculates approximate square root
		double exact = Math.sqrt(n); // Calculates the exact square root
		
		// Prints results
		System.out.printf("Approximated square root\t: %.10f\n", approximate);
		System.out.printf("Math.sqrt() result\t: %.10f", exact);
		
		in.close(); // Closes scanner

	}

	/**
	 * Approximates the square root of a number
	 * @param n : Some positive integer
	 * @return The approximated square root
	 */
	public static double sqrt(long n) {
		// Initializes guesses
	    double lastGuess = 1.0;
	    double nextGuess = (lastGuess + n / lastGuess) / 2.0;

	    // Loops until the next guess is close enough to the last guess
	    while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
	    	// Calculates guesses
	        lastGuess = nextGuess;
	        nextGuess = (lastGuess + n / lastGuess) / 2.0;
	    }

	    return nextGuess; // Returns the approximate verdict
	}
}
