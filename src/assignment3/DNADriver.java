/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 3
 * Due Date: 05/20/2026
 * Date Submitted: 05/13/2026
 *
 * Description: Driver class to test the DNA class. It cycles 
 * through several hardcoded DNA strands to 
 * check helix population, base pairing, and 
 * statistical calculations.
 */

/* Design
   1. Variables: 
      - testStrands (String[]): Array containing the predefined DNA sequences for testing.
      - myDNA (DNA): Object instance used to model the double helix for each test case.
      - LtoRHelix (NucleicAcid[]): Array instance variable for the primary DNA strand.
      - RtoLHelix (NucleicAcid[]): Array instance variable for the complementary DNA strand.
      - adenine, thymine, cytosine, guanine (NucleicAcid): Shared base objects used to demonstrate Association.

   2. Input: 
      - No interactive Scanner input; the DNA sequences are hardcoded as Strings.
      - Input characters from the string are parsed to determine which base object to reference in the arrays.

   3. Processing: 
      - The main method uses a loop to iterate through the testStrands array.
      - The DNA overloaded constructor is called, which triggers LtoRHelixpopulate().
      - LtoRHelixpopulate() maps the input character to the correct base and assigns the complement (A-T, G-C).
      - highestMolarMass() iterates through the helices to find the max molar mass and stores the indices of all matches.
      - totalDensity() sums the density values of all objects in both arrays and calculates a combined total.

   4. Output: 
      - print() displays the specific properties of every NucleicAcid object in the helix.
      - Formatted printf strings are used to display the highest molar mass and total density with decimal precision.
*/
package assignment3;

/**
 * Class to test DNA class
 */
public class DNADriver {

	// Start of program
	public static void main(String[] args) {
		// Array of strands for testing purposes
		String[] testStrands = {
				"AGCCTAGGATCAG", 
				"AGCCTAGGATCTAGGATCAG", 
				"AGCCTATAGGATCAG", 
				"AAAGCCTAGGATAGGATCAG", 
				"AAAGCCTCTGAGGATAGGATCAG"
		};
		
		// Loops through each test string
		for (String s : testStrands) {
			System.out.println("Testing Strand: " + s);
            DNA myDNA = new DNA(s); // Instantiates new DNA
            // Tests all the output functions
            myDNA.print();
            myDNA.highestMolarMass();
            myDNA.totalDensity();
            System.out.println("\n\n"); // Next test split by an extra line
		}
		
	}

}

/* TEST RUN

Testing Strand: AGCCTAGGATCAG
===========================================================
DNA INFORMATION
----------------------

LtoRHelix:

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


RtoLHelix:

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

===========================================================
===========================================================
HIGHEST MOLAR MASS
----------------------
LtoRHelix: 151.13000 g/mol
Indices: 6 7 12 

RtoLHelix: 151.13000 g/mol
Indices: 0 2 3 10 
===========================================================
===========================================================
TOTAL DENSITY
----------------------
LtoRHelix: 22.296 g/cm3
RtoLHelix: 20.892 g/cm3
Total Combined: 43.188 g/cm3
===========================================================



Testing Strand: AGCCTAGGATCTAGGATCAG
===========================================================
DNA INFORMATION
----------------------

LtoRHelix:

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


RtoLHelix:

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

===========================================================
===========================================================
HIGHEST MOLAR MASS
----------------------
LtoRHelix: 151.13000 g/mol
Indices: 6 7 13 14 19 

RtoLHelix: 151.13000 g/mol
Indices: 0 2 3 10 17 
===========================================================
===========================================================
TOTAL DENSITY
----------------------
LtoRHelix: 33.892 g/cm3
RtoLHelix: 31.838 g/cm3
Total Combined: 65.730 g/cm3
===========================================================



Testing Strand: AGCCTATAGGATCAG
===========================================================
DNA INFORMATION
----------------------

LtoRHelix:

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


RtoLHelix:

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

===========================================================
===========================================================
HIGHEST MOLAR MASS
----------------------
LtoRHelix: 151.13000 g/mol
Indices: 8 9 14 

RtoLHelix: 151.13000 g/mol
Indices: 0 2 3 12 
===========================================================
===========================================================
TOTAL DENSITY
----------------------
LtoRHelix: 25.119 g/cm3
RtoLHelix: 23.715 g/cm3
Total Combined: 48.834 g/cm3
===========================================================



Testing Strand: AAAGCCTAGGATAGGATCAG
===========================================================
DNA INFORMATION
----------------------

LtoRHelix:

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


RtoLHelix:

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

===========================================================
===========================================================
HIGHEST MOLAR MASS
----------------------
LtoRHelix: 151.13000 g/mol
Indices: 8 9 13 14 19 

RtoLHelix: 151.13000 g/mol
Indices: 0 1 2 4 5 17 
===========================================================
===========================================================
TOTAL DENSITY
----------------------
LtoRHelix: 34.319 g/cm3
RtoLHelix: 30.484 g/cm3
Total Combined: 64.803 g/cm3
===========================================================



Testing Strand: AAAGCCTCTGAGGATAGGATCAG
===========================================================
DNA INFORMATION
----------------------

LtoRHelix:

Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


RtoLHelix:

Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Adenine
Chemical Formula: C5H5N5
Molar Mass: 135.13000 g/mol
Density: 1.600 g/cm3


Name: Guanine
Chemical Formula: C5H5N5O
Molar Mass: 151.13000 g/mol
Density: 2.200 g/cm3


Name: Thymine
Chemical Formula: C5H6N2O2
Molar Mass: 126.11500 g/mol
Density: 1.223 g/cm3


Name: Cytosine
Chemical Formula: C4H5N3O
Molar Mass: 111.10000 g/mol
Density: 1.550 g/cm3

===========================================================
===========================================================
HIGHEST MOLAR MASS
----------------------
LtoRHelix: 151.13000 g/mol
Indices: 9 11 12 16 17 22 

RtoLHelix: 151.13000 g/mol
Indices: 0 1 2 4 5 7 20 
===========================================================
===========================================================
TOTAL DENSITY
----------------------
LtoRHelix: 39.292 g/cm3
RtoLHelix: 35.834 g/cm3
Total Combined: 75.126 g/cm3
===========================================================

*/
