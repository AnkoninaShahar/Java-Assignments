/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 5, Object Relationship and File IO
 * Due Date: 06/08/2026
 * Date Submitted: 06/06/2026
 *
 * Description: Main entry point for the Grade Analysis program.
 * It coordinates reading student data from a file, calculating 
 * quiz statistics, and displaying the results.
 */

/* Design
1. Variables:
- lab2 (Student[]): Array to store up to 40 Student objects.
- a1 (Util): Utility object used to handle file reading operations.
- statlab2 (Statistics): Object used to calculate high, low, and average scores.

2. Input:
- data.txt: A text file containing a header and student records (ID and 5 quiz scores).
- The file is read line-by-line using BufferedReader and FileReader.

3. Processing:
- Util.readFile() parses each line using StringTokenizer.
- String tokens are converted to integers via Integer.parseInt().
- Student objects are instantiated and stored in the lab2 array.
- Statistics methods (findlow, findhigh, findavg) iterate through the 
  array to perform calculations per quiz column.

4. Output:
- The print() method in Statistics displays formatted tables for 
  Low Scores, High Scores, and Average Scores using printf for alignment.
*/

package assignment5.driver; // Package

// Libraries
import assignment5.model.Statistics;
import assignment5.model.Student;
import assignment5.util.Util;

/**
 * Class to test program
 */
public class Driver {

	// Start of program
	public static void main(String[] args) {
		// Instantiates list of students
		Student lab2 [] = new Student[40];

		Util a1 = new Util(); // Instantiates utilities

		a1.readFile("src\\assignment5\\data.txt", lab2); // Reads the file

		Statistics statlab2 = new Statistics(); // Instantiates statistics
		
		// Finds all the statistics
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);

		statlab2.print(4); // Prints everything
	}

}

/* TEST RUN
==============================

Low Scores:
---
Q1: 0
Q2: 7
Q3: 0
Q4: 32
Q5: 10

High Scores:
---
Q1: 100
Q2: 100
Q3: 100
Q4: 90
Q5: 80

Averages:
---
Q1: 46.2
Q2: 42.333332
Q3: 70.46667
Q4: 75.666664
Q5: 49.733334

==============================
*/