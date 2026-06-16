/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Handles object serialization and deserialization. 
 * Writes StudentGrade objects to a binary file and reads them back 
 * into memory for the API layer to use.
 */

package assignment6.util; // Package

// Libraries
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import assignment6.model.StudentGrade;

/**
 * Class that serializes and deserializes data
 */
public class FileIO {
	
	/**
	 * Serializes data
	 * @param grades data of all students
	 * @param fileName name of file to serialize to
	 */
	public void serializeGrades(StudentGrade grades, String fileName) {
		
		// Tries to run this code
		try {
			
			// Initializes the output streams
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			
			System.out.printf("- Serializing Data         -\n");
			objOut.writeObject(grades); // Serializes the data
			System.out.printf("- Serialization Complete   -\n");
			
			// Closes both streams
			fileOut.close();
			objOut.close();
			
		} catch (IOException e) { // If an exception is thrown
			System.out.printf("\nERROR: %s\n", e.toString()); // Prints error message
		}
	}
	
	/**
	 * Deserializes serializes data
	 * @param fileName name of file to deserialize
	 * @return The data in a student grade object
	 */
	public StudentGrade deserializeGrades(String fileName) {
		
		StudentGrade grades = null; // New grades to store data in
		
		// Tries to run this code
		try {
			
			// Initializes the input streams
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			System.out.printf("- Deserializing Data       -\n");
			grades = (StudentGrade) objIn.readObject(); // Creates object from the serialized data
			System.out.printf("- Deserialization Complete -\n");
			
			// Closes both streams
			fileIn.close();
			objIn.close();
			
		} catch (IOException | ClassNotFoundException e) { // If an exception is thrown
			System.out.printf("\nERROR: %s\n", e.toString()); // Prints error message
		}
		
		// Returns the deserialized data
		return grades;
	}
}
