/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Utility class designed to handle text file I/O. Reads 
 * student data, tokenizes the input, and populates a Student array. 
 * Throws a StudentGradingException if the file is not found.
 */

package assignment6.util; // Package

// Libraries
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import assignment6.exception.StudentGradingException;
import assignment6.model.Student;

/**
 * Utility class to parse file
 */
public class Util {
	
	private String fname; // Filename

	/**
	 * Default constructor
	 */
	public Util() {
		this.fname = "";
	}
	
	/**
	 * Overload constructor
	 * @param fname filename
	 */
	public Util(String fname) {
		this.fname = fname;
	}

	/**
	 * Instantiates students in the inputed student array
	 * @param filename name of the file with data
	 * @param stu array of students
	 * @throws StudentGradingException Custom exception for students
	 */
	public void readFile(String filename, Student [] stu) throws StudentGradingException {
		
		int index = 0; // Instantiates index to 0
		int data[] = new int[6]; // Instantiates array to the data stored in each token
		
		boolean eof = false; // Set to true when end of file is reached
		
		// Attempts to run code and will throw an exception if there exists an error
		try {
			
			// Instantiates the file reader and buffered reader to read the file
			FileReader file = new FileReader((filename == "") ? fname : filename);
			BufferedReader buff = new BufferedReader(file);
			buff.readLine();
			
			// Loops as long as it hasn't reached the end of the file and index is in bounds
			while (!eof && index < stu.length) {
				
				String line = buff.readLine(); // Reads a line from the file
				
				if (line == null) { // Checks if the end of the file is reached
					eof = true; // If so, file ends
				}
				else if (line.trim().isEmpty()) { // Checks if there is no data on the line
					continue; // If so, skip to the next iteration
				}
				else {
					
					StringTokenizer str = new StringTokenizer(line); // Separates line into tokens
				
					// Loops over the separated string as long as there are more tokens
					// The data in each token is stored as an element in the data array
					int innerIndex = 0;
					while(str.hasMoreTokens()) {
						data[innerIndex] = Integer.parseInt(str.nextToken());
						innerIndex++;
					}
					
					// Instantiates a student with the given data
					int SID = data[0];
					int scores[] = { data[1], data[2], data[3], data[4], data[5] };
					stu[index] = new Student(SID, scores);
					
					index++; // Increments index
				}
			}
			
			buff.close(); // Stops the buffered reader
			
		} catch(IOException e) { // If an exception is thrown
			throw new StudentGradingException(0, "File Not Found"); // Throws custom Exception
		}
		finally {
			
		}
		
	}
}
