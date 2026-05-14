/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 3
 * Due Date: 05/20/2026
 * Date Submitted: 05/13/2026
 *
 * Description: Stores
 * 					- Name of the genome
 * 					- Number of genes
 * 					- Number of chromosomes
 * 					- Number of cells
 * 				Contains both a default and an overload constructor,
 * 				mutator and accessor methods, and a print method.
 */
package assignment3;

/**
 * Class containing information regarding a human genome
 */
public class HumanGenome {
	
	// Fields that store data of the genome
	private String genomeName;
	private int numGenes, numChromosomes, numCells;
	
	// Default constructor
	public HumanGenome() {
		// Sets all the fields to default values
		genomeName = "";
		numGenes = 0;
		numChromosomes = 0;
		numCells = 0;
	}
	
	/**
	 * Overload constructor
	 * @param genomeName Name of the genome
	 * @param numGenes Number of genes
	 * @param numChromosomes Number of chromosomes
	 * @param numCells Number of cells (in trillions)
	 */
	public HumanGenome(String genomeName, int numGenes, int numChromosomes, int numCells) {
		// Sets the fields to the inputed values
		this.genomeName = genomeName;
		this.numGenes = numGenes;
		this.numChromosomes = numChromosomes;
		this.numCells = numCells;
	}
	
	
	// MUTATOR METHODS
	//_________________________________________
	
	/**
	 * Sets the name of the genome
	 * @param genomeName New name for the genome
	 */
	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}
	
	/**
	 * Sets the number of genes
	 * @param numGenes New number of genes
	 */
	public void setNumGenes(int numGenes) {
		this.numGenes = numGenes;
	}
	
	/**
	 * Sets the number of chromosomes
	 * @param numChromosomes New number of chromosomes
	 */
	public void setNumChromosomes(int numChromosomes) {
		this.numChromosomes = numChromosomes;
	}
	
	/**
	 * Sets the number of cells (in trillions)
	 * @param numCells New number of cells
	 */
	public void setNumCells(int numCells) {
		this.numCells = numCells;
	}
	
	
	// ACCESSOR METHODS
	
	/**
	 * Retrieves the name of the genome
	 * @return Name of the genome
	 */
	public String getGenomeName() {
		return genomeName;
	}
	
	/**
	 * Retrieves the number of genes
	 * @return Number of genes
	 */
	public int getNumGenes() {
		return numGenes;
	}
	
	/**
	 * Retrieves the number of chromosomes
	 * @return Number of chromosomes
	 */
	public int getNumChromosomes() {
		return numChromosomes;
	}
	
	/**
	 * Retrieves the number of cells (in trillions)
	 * @return Number of cells
	 */
	public int getNumCells() {
		return numCells;
	}
	
	/**
	 * Prints the data of a genome in value name pairs
	 */
	public void print() {
		System.out.printf("\nGenomeName: %s\n", genomeName);
	    System.out.printf("NumberofGenes: %d\n", numGenes);
	    System.out.printf("NumberofChromosomes: %d\n", numChromosomes);
	    System.out.printf("NumberofCells (Trillions): %d\n\n", numCells);
	}
}
