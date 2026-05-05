/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 2, Project 2
 * Due Date: 05/10/2026
 * Date Submitted: 05/04/2026
 *
 * Description: Creates and prints the information of 
 * 				3 human genomes to test the HumanGenome class.
 */

/* Design
   1. Variables: 
      - genomeName (String): Stores the name of the human genome (e.g., "Human Bob").
      - numGenes (int): Stores the number of genes in the genome (e.g., 20000).
      - numChromosomes (int): Stores the count of chromosomes (e.g., 46).
      - numCells (int): Stores the number of cells in trillions (e.g., 76).
      - driver (GenomeInput): Instance of the driver class used to call readValues().
      - LightningMcQueen, Stitch, Mulan (HumanGenome): Object instances named after Disney characters.

   2. Input: 
      - The user is prompted for the Genome Name (String).
      - The user is prompted for the Number of Genes (int).
      - The user is prompted for the Number of Chromosomes (int).
      - The user is prompted for the Number of Cells in trillions (int).
      - scanner.nextLine() is used after nextInt() to clear the buffer for the next loop.

   3. Processing: 
      - The main method instantiates the GenomeInput driver.
      - The readValues() instance method captures user input.
      - The input data is passed to the HumanGenome overloaded constructor.
      - Three distinct HumanGenome objects are created and stored.

   4. Output: 
      - The program calls the print() method for each HumanGenome object.
      - Each property is displayed as a "Label: Value" pair on its own line using System.out.printf().
*/

package assignment2.project2;

import java.util.Scanner; // Library containing the scanner

/**
 * Class to test HumanGenome class
 */
public class GenomeInput {

	static Scanner scanner = new Scanner(System.in); // Scanner for inputs
	
	// Start of program
	public static void main(String[] args) {
		GenomeInput driver = new GenomeInput(); // Instance of the tester
		
		// The three instances of HumanGenome
		HumanGenome LightningMcQueen = driver.readValues();
		LightningMcQueen.print();
		HumanGenome Stitch = driver.readValues();
		Stitch.print();
		HumanGenome Mulan = driver.readValues();
		Mulan.print();
		
		scanner.close(); // Closes scanner
	}
	
	/**
	 * Prompts and stores input from keyboard
	 * @return Human genome from inputed values
	 */
	public HumanGenome readValues() {
		// Variables for inputs
		String genomeName;
		int numGenes, numChromosomes, numCells;
		
		// Prompts user and reads inputs
		System.out.printf("Enter the genome name: ");
		genomeName = scanner.nextLine();
		System.out.printf("Enter the number of genes: ");
		numGenes = scanner.nextInt();
		System.out.printf("Enter the number of chromosomes: ");
		numChromosomes = scanner.nextInt();
		System.out.printf("Enter the number of cells (in trillions): ");
		numCells = scanner.nextInt();
		scanner.nextLine();
		
		// Creates and returns instance of HumanGenome
		return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
	}
}