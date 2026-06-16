/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Stores a 4-digit Student ID and an array of 5 quiz scores.
 * Implements Serializable to allow the object to be saved to a binary file.
 * Contains constructors, mutators, accessors, and a print method.
 */

package assignment6.model; // Package

// Libraries
import java.io.Serializable;

/**
 * Represents a student with a student ID and test scores
 */
public class Student implements Serializable {

	 private static final long serialVersionUID = 1L; // Version ID
	 
	 private int SID = 0000; // Student ID
	 private int scores[] = new int[5]; // Test scores

	 /**
	  * Default constructor
	  */
	 public Student() {
		 SID = 0000;
		 scores = new int[5];
	 }
	 
	 /**
	  * Overload constructor
	  * @param SID four digit student ID
	  * @param scores list of test scores
	  */
	 public Student(int SID, int scores[]) {
		 this.SID = SID;
		 this.scores = scores;
	 }
	 
	 /**
	  * Sets the student ID
	  * @param SID new student ID
	  */
	 public void setSID(int SID) {
		 this.SID = SID;
	 }
	 
	 /**
	  * Sets the scores
	  * @param scores new scores
	  */
	 public void setScores(int scores[]) {
		 this.scores = scores;
	 }
	 
	 /**
	  * Retrieves student ID
	  * @return the student ID
	  */
	 public int getSID() {
		 return SID;
	 }
	 
	 /**
	  * Retrieves the scores
	  * @return the scores
	  */
	 public int[] getScores() {
		 return scores;
	 }

	 /**
	  * Prints the information stored in the student
	  */
	 public void print() {
		 System.out.printf("\n\n=============================\n");
		 System.out.printf("Student ID: %04d\n---\n", SID); // Prints ID
		 
		 // Prints test scores
		 for (int i = 0; i < scores.length; ++i) {
			 System.out.printf("Quarter %d: %d%%\n", i + 1, scores[i]);
		 }
		 
		 System.out.printf("=============================\n");
	 }
}
