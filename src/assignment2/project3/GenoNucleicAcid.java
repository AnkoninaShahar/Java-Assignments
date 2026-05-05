/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 2, Project 3
 * Due Date: 05/10/2026
 * Date Submitted: 05/04/2026
 *
 * Description: Creates and prints the information of 
 * 				3 nucleic acids to test the NucleicAcid class.
 */

/* Design
   1. Variables: 
      - name (String): Name of the nucleic acid (e.g., "Cytosine").
      - chemicalFormula (String): Chemical formula (e.g., "C4H5N3O").
      - molarMass (double): Molar mass of the acid.
      - density (double): Density of the acid.
      - cytosine, adenine, guanine, thymine, uracil (NucleicAcid): Object instances for each acid.

   2. Input: 
      - User enters String for name and formula.
      - User enters doubles for molar mass and density.
      - scanner.nextLine() is used after nextDouble() to prevent skipping the next String input.

   3. Processing: 
      - main() creates a driver instance and calls readValues() five times.
      - Overloaded constructor initializes each NucleicAcid object.

   4. Output: 
      - print() method displays the properties using printf formatted strings.
*/
package assignment2.project3;

import java.util.Scanner; // Library containing the scanner

/**
 * Class to test NucleicAcid class
 */
public class GenoNucleicAcid {
	
static Scanner scanner = new Scanner(System.in); // Scanner for inputs
	
	// Start of program
	public static void main(String[] args) {
		GenoNucleicAcid driver = new GenoNucleicAcid(); // Instance of the tester
		
		// The three instances of NucleicAcid
		NucleicAcid cytosine = driver.readValues();
		cytosine.print();
		NucleicAcid adenine = driver.readValues();
		adenine.print();
		NucleicAcid guanine = driver.readValues();
		guanine.print();
		NucleicAcid thymine = driver.readValues();
		thymine.print();
		NucleicAcid uracil = driver.readValues();
		uracil.print();
		
		scanner.close(); // Closes scanner
	}
	
	/**
	 * Prompts and stores input from keyboard
	 * @return Nucleic acid from inputed values
	 */
	public NucleicAcid readValues() {
		// Variables for inputs
		String name, chemicalFormula;
		float molarMass, density;
		
		// Prompts user and reads inputs
		System.out.printf("Enter the nucleic acid name: ");
		name = scanner.nextLine();
		System.out.printf("Enter the chemical formula: ");
		chemicalFormula = scanner.nextLine();
		System.out.printf("Enter the molar mass: ");
		molarMass = scanner.nextFloat();
		System.out.printf("Enter the density: ");
		density = scanner.nextFloat();
		scanner.nextLine();
		
		// Creates and returns instance of nucleic acid
		return new NucleicAcid(name, chemicalFormula, molarMass, density);
	}
}

/* TEST RUN

Enter the nucleic acid name: Cytosine
Enter the chemical formula: C4H5N3O
Enter the molar mass: 111.10
Enter the density: 1.55

Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

Enter the nucleic acid name: Adenine
Enter the chemical formula: C5H5N5
Enter the molar mass: 135.13
Enter the density: 1.6

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3

Enter the nucleic acid name: Guanine
Enter the chemical formula: C5H5N5O
Enter the molar mass: 151.13
Enter the density: 2.200

Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3

Enter the nucleic acid name: Thymine
Enter the chemical formula: C5H6N2O2
Enter the molar mass: 126.115
Enter the density: 1.223

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3

Enter the nucleic acid name: Uracil
Enter the chemical formula: C4H4N2O2
Enter the molar mass: 112.08676
Enter the density: 1.32

Name: Uracil
Chemical Formula: C4H4N2O2
Molar Mass: 112.08676 g/mol
Density: 1.320 g/cm3

*/
