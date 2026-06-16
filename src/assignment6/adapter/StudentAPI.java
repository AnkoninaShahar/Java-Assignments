/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: An interface defining the contract for the adapter 
 * pattern. Declares methods to print classroom statistics and 
 * search for a specific student's scores by ID.
 */

package assignment6.adapter; // Package

/**
 * Interface class that prints student data
 */
public interface StudentAPI {
	
	/**
	 * Prints overall statistics
	 */
	public abstract void printStatistics();
	
	/**
	 * Prints a specific students scores
	 * @param SID ID of student
	 */
	public abstract void printScores(int SID);
}
