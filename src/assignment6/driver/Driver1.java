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
      - stu (Student[]): An array used to store the student data records.
      - fileReader (Util): An instance of the utility class used to read the file.
      - fileName (String): A string initialized to an empty value to trigger a file exception.
      - fixed (boolean): A loop-control flag tracking whether file parsing succeeded.
      - e (StudentGradingException): The custom exception caught when file reading fails.

   2. Input:
      - An intentionally invalid file path string ("") that triggers a file error, followed by interactive console user text inputs to dynamically supply a working filename.

   3. Processing:
      - A do-while loop attempts to run the file reader inside a try block.
      - Upon failure, the catch block logs exception metrics via logException() and updates the target filename by querying the console via fixException().

   4. Output:
      - An error entry written to an external text log file, and a successfully populated array of Student data models residing in memory.
*/

package assignment6.driver; // Package

// Libraries
import assignment6.exception.StudentGradingException;
import assignment6.model.Student;

/**
 * Class to test the exception handler
 */
public class Driver1 {

	// Start of program
	public static void main(String[] args) {
		
		// Array of 40 students
		Student stu [] = new Student[40];
		
		// Attempting to read file with wrong name
		StudentGradingException.safeReadFile(stu, "Wrong Name");
	}

}

/* TEST RUN
ATTEMPTING TO READ Wrong Name...

ERROR [errorNo=0, errorMsg=File Not Found]

LOGGING EXCEPTION...
EXCEPTION LOGGED IN error_log.txt!

ENTER NEW FILE NAME: data
ATTEMPTING TO READ data...

ERROR [errorNo=0, errorMsg=File Not Found]

LOGGING EXCEPTION...
EXCEPTION LOGGED IN error_log.txt!

ENTER NEW FILE NAME: dataa.txt
ATTEMPTING TO READ dataa.txt...

ERROR [errorNo=0, errorMsg=File Not Found]

LOGGING EXCEPTION...
EXCEPTION LOGGED IN error_log.txt!

ENTER NEW FILE NAME: data.txt
ATTEMPTING TO READ data.txt...

SUCCESSFULLY READ data.txt...
*/