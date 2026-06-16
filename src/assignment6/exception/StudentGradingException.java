/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Custom exception handler class. Centralizes the capture 
 * of file I/O exceptions, logs error details to a text file, and provides 
 * a mechanism to fix issues dynamically via console input.
 */

package assignment6.exception; // Package

// Libraries
import java.util.Scanner;

import assignment6.model.Student;
import assignment6.util.Util;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Custom exception handler for student grading
 */
public class StudentGradingException extends Exception {

	private static final long serialVersionUID = 1L; // Version ID
	
	// Components of an error
	private int errorNo;
	private String errorMsg;
	
	/**
	 * Default constructor
	 */
	public StudentGradingException() {
		super();
		
		// Sets default values
		this.errorNo = -1;
		this.errorMsg = "";
		
		print(); // Prints error
	}
	
	/**
	 * Override constructor
	 * @param errorNo Number associated with the error
	 */
	public StudentGradingException(int errorNo) {
		super();
		
		// Initializes the error number
		this.errorNo = errorNo;
		this.errorMsg = "";
		
		print(); // Prints error
	}
	
	/**
	 * Override constructor
	 * @param errorMsg Message describing the error
	 */
	public StudentGradingException(String errorMsg) {
		super();
		
		// Initializes the error message
		this.errorNo = -1;
		this.errorMsg = errorMsg;
		
		print(); // Prints error
	}
	
	/**
	 * Override constructor
	 * @param errorNo Number associated with the error
	 * @param errorMsg Message describing the error
	 */
	public StudentGradingException(int errorNo, String errorMsg) {
		super();
		
		// Initializes the error number and message
		this.errorNo = errorNo;
		this.errorMsg = errorMsg;
	}
	
	/**
	 * Sets the error number 
	 * @param errorNo Number associated with the error
	 */
	public void setErrorNo(int errorNo) {
		this.errorNo = errorNo;
	}
	
	/**
	 * Sets the error message
	 * @param errorMsg Message describing the error
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	/**
	 * Retrieves the error number
	 * @return The number associated with the error
	 */
	public int getErrorNo() {
		return errorNo;
	}
	
	/**
	 * Retrieves the error message
	 * @return The message describing the error
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	
	/**
	 * Prints the error
	 */
	public void print() {
		System.out.printf("ERROR [errorNo=%d, errorMsg=%s]\n\n", errorNo, errorMsg);
	}
	
	/**
	 * Allows the user to fix the exception through console
	 * @return The new name of the file
	 */
	@SuppressWarnings("resource")
	public String fixException() {
		
		// Checks if error is the right type
		if (this.errorNo == 0) {
			
			// Scans for new file name in console
			Scanner scanner = new Scanner(System.in);
			
			System.out.printf("ENTER NEW FILE NAME: ");
			String fileName = scanner.next();
			
			return fileName; // Returns the file name
		}
		
		System.out.printf("ATTEMPTING data.txt...\n\n");
		return "src\\assignment6\\data.txt"; // Returns default file name
	}
	
	/**
	 * Logs exceptions that occur in a text file
	 */
	public void logException() {
		
		System.out.printf("LOGGING EXCEPTION...\n");
		
		// Tries to run this code
		try {
			
			// Creates a file to write in
			String fileName = "error_log.txt";
			FileWriter file = new FileWriter(fileName, true);
			BufferedWriter buff = new BufferedWriter(file);
			
			// Stores the error in the file
			buff.write("[errorNo=" + errorNo + ", errorMsg=" + errorMsg + "]\n");
			
			buff.close(); // Closes file
			
			System.out.printf("EXCEPTION LOGGED IN %s!\n\n", fileName);
			
		} catch (IOException e) { // If an exception is thrown
			System.out.printf("\nERROR: %s\n", e.toString()); // Prints error message
		}
	}
	
	/**
	 * Centralized method to read files using custom exception handler
	 * @param students Array of students
	 * @param initialFileName The name of the file originally inputed
	 */
	public static void safeReadFile(Student[] students, String initialFileName) {

		// Initializes necessary components
		Util fileReader = new Util();
		String fileName = initialFileName;
		
		// Boolean that checks when the name of the file is fixed
		boolean fixed = false;		
		
		// do-while loop
		do {
			
			// Tries to run this code
			try {
				
				System.out.printf("ATTEMPTING TO READ %s...\n\n", fileName);
				
				// Attempts to read file
				fileReader.readFile(fileName, students);
				
				// If that works then fixed is set to true
				fixed = true;
			}
			catch (StudentGradingException e) { // If an exception is thrown
				
				// Logs exception and attempts to fix it
				e.print();
				e.logException();
				fileName = e.fixException();
			}
			
		} while(!fixed); // Will loop until fixed is set to true
		
		System.out.printf("SUCCESSFULLY READ %s...\n\n", fileName);
	}
}
