/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 3
 * Due Date: 05/20/2026
 * Date Submitted: 05/13/2026
 *
 * Description: Stores
 * 					- Name of the nucleic acid
 * 					- Chemical formula of the nucleic acid
 * 					- Molar mass of the nucleic acid
 * 					- Density of the nucleic acid
 * 				Contains both a default and an overload constructor,
 * 				mutator and accessor methods, and a print method.
 */
package assignment3;

/**
 * Class containing information regarding a nucleic acid
 */
public class NucleicAcid {
	
	// Fields that store data of the nucleic acid
	private String name, chemicalFormula;
	private float molarMass, density;
	
	// Default constructor
	public NucleicAcid() {
		// Sets all the fields to default values
		name = "";
		chemicalFormula = "";
		molarMass = 0.0f;
		density = 0.0f;
	}
	
	/**
	 * Overload constructor
	 * @param name Name of the chemical
	 * @param chemicalFormula Formula of the chemical
	 * @param molarMass Molar mass of the chemical
	 * @param density Density of the chemical
	 */
	public NucleicAcid(String name, String chemicalFormula, float molarMass, float density) {
		// Sets the fields to the inputed values
		this.name = name;
		this.chemicalFormula = chemicalFormula;
		this.molarMass = molarMass;
		this.density = density;
	}
	
	
	// MUTATOR METHODS
	//_________________________________________
	
	/**
	 * Sets the name of the chemical
	 * @param name New name of the chemical
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the formula of the chemical
	 * @param chemicalFormula New formula for the chemical
	 */
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	
	/**
	 * Sets the molar mass of the chemical
	 * @param molarMass New molar mass of the chemical
	 */
	public void setMolarMass(float molarMass) {
		this.molarMass = molarMass;
	}
	
	/**
	 * Sets the density of the chemical
	 * @param density New density of the chemical
	 */
	public void setDensity(float density) {
		this.density = density;
	}
	
	
	// ACCESSOR METHODS
	
	/**
	 * Retrieves the name of the chemical
	 * @return Name of the chemical
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the formula of the chemical
	 * @return Chemical Formula
	 */
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	
	/**
	 * Retrieves the molar mass of the chemical
	 * @return Molar mass of the chemical
	 */
	public float getMolarMass() {
		return molarMass;
	}
	
	/**
	 * Retrieves the density of the chemical
	 * @return Density of the chemical
	 */
	public float getDensity() {
		return density;
	}
	
	/**
	 * Prints the data of a nucleic acid in value name pairs
	 */
	public void print() {
		System.out.printf("\nName: %s\n", name);
	    System.out.printf("Chemical Formula: %s\n", chemicalFormula);
	    System.out.printf("Molar Mass: %.5f g/mol\n", molarMass);
	    System.out.printf("Density: %.3f g/cm3\n\n", density);
	}
}


