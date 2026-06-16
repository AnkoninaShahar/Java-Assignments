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
      - stu (Student[]): An array used to store the student records.
      - stats (Statistics): An instance computed from student scores to track quiz metrics.
      - grades (StudentGrade): A composite object encapsulating both student data and statistics.
      - report (FileIO): A utility instance responsible for handling object serialization streams.
      - fileName (String): A string containing the path designation for binary disk storage.
      - desergrades (StudentGrade): A reference target to load the retrieved deserialized graph.

   2. Input:
      - Hardcoded text file data sourced from "data.txt" to build the underlying object relationships.

   3. Processing:
      - Computes class metrics (low, high, average), attaches them to a single wrapper object, passes that object to a FileOutputStream byte stream, and reads the bytes back using an FileInputStream.

   4. Output:
      - A binary serialization file named "student_grades.ser" written to disk, and a matching verification dump printed directly to the system console.
*/

package assignment6.driver; // Package

// Libraries
import assignment6.model.Statistics;
import assignment6.model.Student;
import assignment6.model.StudentGrade;
import assignment6.util.FileIO;
import assignment6.exception.StudentGradingException;

/**
 * Class to test serialization of data
 */
public class Driver2 {
	
	// Start of program
	public static void main(String[] args) {
		
		// Array of 40 students
		Student stu [] = new Student[40];
		
		// Collects Data
		StudentGradingException.safeReadFile(stu, "src\\assignment6\\data.txt");

		Statistics stats = new Statistics(); // Instantiates statistics

		// Finds all the statistics
		stats.findlow(stu);
		stats.findhigh(stu);
		stats.findavg(stu);

		// Gathers necessary components to serialize data
		StudentGrade grades = new StudentGrade(stu, stats);
		FileIO report = new FileIO();
		String fileName = "student_grades.ser";
		
		// Serializes the data
		report.serializeGrades(grades, "student_grades.ser");
		
		// Deserializes serialized data for testing purposes
		StudentGrade desergrades = report.deserializeGrades(fileName);
		
		// Prints deserialized data if it exists
		if (desergrades != null) {
			desergrades.print();
	    }
	}
}

/* TEST RUN
ATTEMPTING TO READ data.txt...

SUCCESSFULLY READ data.txt...

- Serializing Data         -
- Serialization Complete   -
- Deserializing Data       -
- Deserialization Complete -


=============================
Student ID: 1234
---
Quarter 1: 52%
Quarter 2: 7%
Quarter 3: 100%
Quarter 4: 78%
Quarter 5: 34%
=============================


=============================
Student ID: 2134
---
Quarter 1: 90%
Quarter 2: 36%
Quarter 3: 90%
Quarter 4: 77%
Quarter 5: 30%
=============================


=============================
Student ID: 3124
---
Quarter 1: 100%
Quarter 2: 45%
Quarter 3: 20%
Quarter 4: 90%
Quarter 5: 70%
=============================


=============================
Student ID: 4532
---
Quarter 1: 11%
Quarter 2: 17%
Quarter 3: 81%
Quarter 4: 32%
Quarter 5: 77%
=============================


=============================
Student ID: 5678
---
Quarter 1: 20%
Quarter 2: 12%
Quarter 3: 45%
Quarter 4: 78%
Quarter 5: 34%
=============================


=============================
Student ID: 6134
---
Quarter 1: 34%
Quarter 2: 80%
Quarter 3: 55%
Quarter 4: 78%
Quarter 5: 45%
=============================


=============================
Student ID: 7874
---
Quarter 1: 60%
Quarter 2: 100%
Quarter 3: 56%
Quarter 4: 78%
Quarter 5: 78%
=============================


=============================
Student ID: 8026
---
Quarter 1: 70%
Quarter 2: 10%
Quarter 3: 66%
Quarter 4: 78%
Quarter 5: 56%
=============================


=============================
Student ID: 9893
---
Quarter 1: 34%
Quarter 2: 9%
Quarter 3: 77%
Quarter 4: 78%
Quarter 5: 20%
=============================


=============================
Student ID: 1947
---
Quarter 1: 45%
Quarter 2: 40%
Quarter 3: 88%
Quarter 4: 78%
Quarter 5: 55%
=============================


=============================
Student ID: 2877
---
Quarter 1: 55%
Quarter 2: 50%
Quarter 3: 99%
Quarter 4: 78%
Quarter 5: 80%
=============================


=============================
Student ID: 3189
---
Quarter 1: 22%
Quarter 2: 70%
Quarter 3: 100%
Quarter 4: 78%
Quarter 5: 77%
=============================


=============================
Student ID: 4602
---
Quarter 1: 89%
Quarter 2: 50%
Quarter 3: 91%
Quarter 4: 78%
Quarter 5: 60%
=============================


=============================
Student ID: 5405
---
Quarter 1: 11%
Quarter 2: 11%
Quarter 3: 0%
Quarter 4: 78%
Quarter 5: 10%
=============================


=============================
Student ID: 6999
---
Quarter 1: 0%
Quarter 2: 98%
Quarter 3: 89%
Quarter 4: 78%
Quarter 5: 20%
=============================


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
