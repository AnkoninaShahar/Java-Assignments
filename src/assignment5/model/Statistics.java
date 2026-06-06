/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 5
 * Due Date: 06/08/2026
 * Date Submitted: 06/06/2026
 *
 * Description: Stores
 * - Array of low scores for each quiz
 * - Array of high scores for each quiz
 * - Array of average scores for each quiz
 * Includes methods to traverse a Student array to
 * calculate quiz-specific statistical data and
 * a print method for reporting results.
 */

package assignment5.model; // Package

/**
 * Calculates statistics for a given list of students
 */
public class Statistics {
	
	// Lowest, highest, and average score for each test
	private int [] lowscores = new int [5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];

	/**
	 * Finds the lowest score among the students for each test
	 * @param a list of students
	 */
	public void findlow(Student [] a) {
		
		// Loops through low scores array
		for (int i = 0; i < lowscores.length; ++i) {
			lowscores[i] = Integer.MAX_VALUE; // Sets the element to the integer maximum
			
			// Loops through students
			for (Student s : a) {
				if (s != null) { // Checks that the student exists
					
					// Gets score and checks if it is lower than the current low score
					int score = s.getScores()[i];
					if (score < lowscores[i]) {
						lowscores[i] = score; // If so, sets low score
					}
					
				}
			}
		}
	}

	/**
	 * Finds the highest score among the students for each test
	 * @param a list of students
	 */
	public void findhigh(Student [] a) {

		// Loops through high scores array
		for (int i = 0; i < highscores.length; ++i) {
			highscores[i] = Integer.MIN_VALUE; // Sets the element to the integer minimum
			
			// Loops through students
			for (Student s : a) {
				if (s != null) { // Checks that the student exists
					
					// Gets score and checks if it is lower than the current high score 
					int score = s.getScores()[i];
					if (score > highscores[i]) {
						highscores[i] = score; // If so, sets high score
					}
				}
			}
		}
	}

	/**
	 * Finds the average of the scores among the students for each test
	 * @param a list of students
	 */
	public void findavg(Student [] a) {

		// Loops through average scores array
		for (int i = 0; i < avgscores.length; ++i) {
			int sum = 0; // Initializes sum to 0
			int count = 0; // Initializes count to 0
			
			// Loops through students
			for (Student s : a) {
				if (s != null) { // Checks that the student exists
					sum += s.getScores()[i]; // Adds the score to the overall sum
					count++;
				}
			}
			
			// Divides the sum by the number of students that exist
			avgscores[i] = ((float)sum) / count;
		}
	}

	/**
	 * Prints statistics stored in the fields
	 * @param option selects which statistics to print:
	 * 		1 - Low scores
	 * 		2 - High scores
	 * 		3 - Averages
	 * 		4 - Everything
	 */
	public void print(int option) {
		String str = "==============================\n";
		
		// Prints the low scores
		if (option == 1 || option == 4) {
			str += "\nLow Scores:\n---\n";
			
			// Adds each score to the overall string
			for (int i = 0; i < lowscores.length; ++i) {
				str += "Q" + (i + 1) + ": " + lowscores[i] + "\n";
			}
		}
		
		// Prints the high scores
		if (option == 2 || option == 4) {
			str += "\nHigh Scores:\n---\n";
			
			// Adds each score to the overall string
			for (int i = 0; i < highscores.length; ++i) {
				str += "Q" + (i + 1) + ": " + highscores[i] + "\n";
			}
		}
		
		// Prints the averages
		if (option == 3 || option == 4) {
			str += "\nAverages:\n---\n";
			
			// Adds each score to the overall string
			for (int i = 0; i < avgscores.length; ++i) {
				str += "Q" + (i + 1) + ": " + avgscores[i] + "\n";
			}
		}
		
		// Prints the string
		System.out.printf("%s\n==============================\n", str);

	}
}
