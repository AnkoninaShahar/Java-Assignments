/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 3
 * Due Date: 05/20/2026
 * Date Submitted: 05/13/2026
 *
 * Description: Implements Containment by using arrays of NucleicAcid 
 * 				objects as instance variables. It also implements 
 * 				Association by referencing shared base objects 
 * 				rather than creating new ones. Includes methods 
 * 				to populate helices, calculate total density, and 
 * 				find highest molar mass indices.
 */
package assignment3;

/**
 * Class containing information regarding a DNA
 */
public class DNA {
	// Declares arrays for the left and right side of the double helix
	private NucleicAcid[] LtoRHelix, RtoLHelix;
	
	// Default constructor
	public DNA() {
		LtoRHelix = null;
		RtoLHelix = null;
	}
	
	/**
	 * Overload constructor
	 * @param strand Strand of DNA nucleic acids
	 */
	public DNA(String strand) {
		LtoRHelixpopulate(strand);
	}
	
	/**
	 * Fills the left to right helix with the appropriate nucleic acids
	 * Then fills the right to left helix with the inverse nucleic acids
	 * @param strand Strand of DNA nucleic acids
	 */
	public void LtoRHelixpopulate(String strand) {
		// Instantiates arrays for each side
		LtoRHelix = new NucleicAcid[strand.length()];
		RtoLHelix = new NucleicAcid[strand.length()];
		
		// Instantiates all the nucleic acids to fill the helices
		NucleicAcid cytosine = new NucleicAcid("Cytosine", "C4H5N3O", 111.1f, 1.55f);
		NucleicAcid adenine = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
		NucleicAcid guanine = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.2f);
		NucleicAcid thymine = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
		
		// Loops through the strand
		for (int i = 0; i < strand.length(); i++) {
			// Checks which nucleic acid should be inputed
			switch(strand.charAt(i)) {
			case 'A': // Check for Adenine
				LtoRHelix[i] = adenine;
				RtoLHelix[i] = thymine;
				break;
			case 'G': // Check for Guanine
				LtoRHelix[i] = guanine;
				RtoLHelix[i] = cytosine;
				break;
			case 'T': // Check for Thymine
				LtoRHelix[i] = thymine;
				RtoLHelix[i] = adenine;
				break;
			case 'C': // Check for Cytosine
				LtoRHelix[i] = cytosine;
				RtoLHelix[i] = guanine;
				break;
			default: // If the character does not fall into the nucleic acids
				// Prints error message
				System.out.printf("ERROR: %c NOT IN SEQUENCE", strand.charAt(i));
				break;
			}
		}
	}
	
	/**
	 * Finds and prints the highest molar mass and indices where it appears for both helices
	 */
	public void highestMolarMass() {
		// Declares and instantiates necessary variables to store values
		float highestLtoR = 0.0f, highestRtoL = 0.0f;
		String indicesLtoR = "", indicesRtoL = "";
		
		// Initial loop to determine the highest value for both helices
		for (int i = 0; i < LtoRHelix.length; i++) {
			
			// LEFT TO RIGHT HELIX:
			//________________________________________________________
			
			// Checks if a new molar mass is greater than the previously stored one
			if (LtoRHelix[i].getMolarMass() > highestLtoR) {
				highestLtoR = LtoRHelix[i].getMolarMass(); // Updates variable that stores highest molar mass
				indicesLtoR = ""; // Resets indices
			}
			// Checks if it's equal to the current highest value
			else if (Math.abs(LtoRHelix[i].getMolarMass() - highestLtoR) < 1e-2f) {
				indicesLtoR += i + " "; // Adds index to the list
			}
			
			// LEFT TO RIGHT HELIX:
			//________________________________________________________
		
			// Checks if a new molar mass is greater than the previously stored one
			if (RtoLHelix[i].getMolarMass() > highestRtoL) {
				highestRtoL = RtoLHelix[i].getMolarMass(); // Updates variable that stores highest molar mass
				indicesRtoL += i + " "; // Resets indices
			}
			// Checks if it's equal to the current highest value
			else if (Math.abs(RtoLHelix[i].getMolarMass() - highestRtoL) < 1e-2f) {
				indicesRtoL += i + " "; // Adds index to the list
			}
		}
		
		// Prints out highest molar mass and index values
		System.out.printf("===========================================================\n");
		System.out.printf("HIGHEST MOLAR MASS\n");
		System.out.printf("----------------------\n");
		System.out.printf("LtoRHelix: %.5f g/mol\nIndices: %s\n\n", highestLtoR, indicesLtoR);
		System.out.printf("RtoLHelix: %.5f g/mol\nIndices: %s\n", highestRtoL, indicesRtoL);
		System.out.printf("===========================================================\n");
	}
	
	/**
	 * Calculates and prints out the total density of the helices
	 */
	public void totalDensity() {
		// Declares and instantiates variables to store the sum of each helix
		float totalLtoRDensity = 0.0f, totalRtoLDensity = 0.0f;
		
		// Loops through the nucleic acids in each helix
		for (int i = 0; i < LtoRHelix.length; i++) {
			// Sums up density of each nucleic acid
			totalLtoRDensity += LtoRHelix[i].getDensity();
			totalRtoLDensity += RtoLHelix[i].getDensity();
		}
		
		// Prints the total density of both helices and the total combined
		System.out.printf("===========================================================\n");
		System.out.printf("TOTAL DENSITY\n");
		System.out.printf("----------------------\n");
		System.out.printf("LtoRHelix: %.3f g/cm3\n", totalLtoRDensity);
		System.out.printf("RtoLHelix: %.3f g/cm3\n", totalRtoLDensity);
		System.out.printf("Total Combined: %.3f g/cm3\n", (totalLtoRDensity + totalRtoLDensity));
		System.out.printf("===========================================================\n");
	}
	
	/**
	 * Prints the information of the DNA
	 */
	public void print() {
		// Prints the information
		System.out.printf("===========================================================\n");
		System.out.printf("DNA INFORMATION\n");
		System.out.printf("----------------------\n");
		System.out.printf("\nLtoRHelix:\n");
		
		// Loops through each nucleic acid for the left to right helix
		for (int i = 0; i < LtoRHelix.length; i++) {
			LtoRHelix[i].print(); // Prints information
		}
		
		// Loops through each nucleic acid for the right to left helix
		System.out.printf("\nRtoLHelix:\n");
		for (int i = 0; i < RtoLHelix.length; i++) {
			RtoLHelix[i].print(); // Prints information
		}
		
		System.out.printf("===========================================================\n");
	}
}
