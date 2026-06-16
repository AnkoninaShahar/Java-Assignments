/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 6
 * Due Date: 06/18/2026
 * Date Submitted: 06/16/2026
 *
 * Description: Implements the StudentAPI interface. Deserializes a 
 * StudentGrade object upon instantiation and provides the underlying 
 * logic to print overall statistics and specific student scores.
 */

package assignment6.adapter; // Package

import assignment6.model.Student;
import assignment6.model.Statistics;
import assignment6.model.StudentGrade;
import assignment6.util.FileIO;
/**
 * Class that implements the student API
 */
public class StudentAPIImpl implements StudentAPI {

	private StudentGrade grades; // All the grades and statistics
	
	/**
	 * Constructor
	 * @param serializedFileName file name to retrieve data from
	 */
	public StudentAPIImpl(String serializedFileName) {
		
		// Deserializes data
		FileIO report = new FileIO();
		grades = report.deserializeGrades(serializedFileName);
	}
	
	@Override
	public void printStatistics() {
		
		// Prints statistics (lowest, highest, and average)
		System.out.printf("\nPrinting Statistics...\n");
		Statistics statistics = grades.getStatistics();
		statistics.print(4);
	}

	@Override
	public void printScores(int SID) {
		
		// Get array of all students
		Student[] students = grades.getStudent();
		
		// Prints scores
		System.out.printf("\nPrinting Scores...\n");
		System.out.printf("=============================\n");
		for(Student student : students) { // Loops over every student
			
			// Checks that the student exists and has the correct ID
			if (student != null && student.getSID() == SID) {
				
				System.out.printf("Scores [ID=%d]:\n---\n", SID);
				int[] scores = student.getScores();
				
				// Loops over scores and prints each one out
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("Quiz %d: %d\n", i + 1, scores[i]);
				}
			
			}
		
		}
		
		System.out.printf("=============================\n");
		
	}
	
}
