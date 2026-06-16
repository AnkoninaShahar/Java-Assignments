/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: A wrapper class that aggregates an array of Student objects 
 * and a Statistics object into a single entity. Implements Serializable 
 * to facilitate writing the entire classroom state to a file.
 */

package assignment6.model; // Package

// Libraries
import java.io.Serializable;

/**
 * Class that contains all the student and statistics data
 */
public class StudentGrade implements Serializable{
	
	private static final long serialVersionUID = 1L; // Version ID
	
	// Array of students and statistics
	private Student[] students;
	private Statistics statistics;
	
	/**
	 * Default constructor
	 */
	public StudentGrade() {
		
		// Initializes fields to default values
		this.students = null;
		this.statistics = null;
	}
	
	/**
	 * Overload constructor
	 * @param stu Array of students
	 */
	public StudentGrade(Student[] students) {
		
		// Initializes students
		this.students = students;
		this.statistics = null;
	}
	
	/**
	 * Overload constructor
	 * @param stats statistics of students
	 */
	public StudentGrade(Statistics statistics) {
		
		// Initializes statistics
		this.students = null;
		this.statistics = statistics;
	}
	
	/**
	 * Overload constructor
	 * @param students Array of students
	 * @param statistics statistics of students
	 */
	public StudentGrade(Student[] students, Statistics statistics) {
		
		// Initializes students and statistics
		this.students = students;
		this.statistics = statistics;
	}
	
	/**
	 * Sets array of students
	 * @param students new array of students
	 */
	public void setStudent(Student[] students) {
		this.students = students;
	}
	
	/**
	 * Sets statistics
	 * @param statistics new set of statistics
	 */
	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}
	
	/**
	 * Retrieves array of students
	 * @return The array of students
	 */
	public Student[] getStudent() {
		return students;
	}
	
	/**
	 * Retrieves the statistics
	 * @return The statistics of the students
	 */
	public Statistics getStatistics() {
		return statistics;
	}
	
	/**
	 * Prints all the student and statistics information
	 */
	public void print() {
		
		// Loops through each student
		for(Student student : students) {
			
			// Checks that the student exists
			if (student != null) {
				student.print(); // Prints the student data
			}
		}
		
		// Prints all the statistics data
		System.out.printf("\n\n");
		statistics.print(4);
	}
}
