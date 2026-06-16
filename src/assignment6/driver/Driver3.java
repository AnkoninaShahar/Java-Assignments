/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Test driver for Assignment 6.
 */

/* Design
   1. Variables:
      - implementation (StudentAPIImpl): An API controller tracking data states through an interface boundary layer.

   2. Input:
      - The local serialized file identifier path ("student_grades.ser") along with an explicit query student ID (1234).

   3. Processing:
      - The API constructor automatically initiates an internal deserialization sequence to ingest data.
      - Decoupled interface wrappers (printScores and printStatistics) execute target collection lookups and look through nested instances.

   4. Output:
      - Printed console report tables isolating the designated student's quiz scores and the class-wide quiz performance calculations.
*/

package assignment6.driver; // Package

// Libraries
import assignment6.adapter.StudentAPIImpl;

/**
 * Class to test student API implementation
 */
public class Driver3 {

	// Start of program
	public static void main(String[] args) {
		
		// Instantiate new implementation
		StudentAPIImpl implementation = new StudentAPIImpl("student_grades.ser");
		
		// Print out data
		implementation.printScores(6134);
		implementation.printStatistics();
	}

}

/* TEST RUN
- Deserializing Data       -
- Deserialization Complete -

Printing Scores...
=============================
Scores [ID=6134]:
---
Quiz 1: 34
Quiz 2: 80
Quiz 3: 55
Quiz 4: 78
Quiz 5: 45
=============================

Printing Statistics...
=============================

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

=============================

*/