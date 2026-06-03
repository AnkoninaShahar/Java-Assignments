/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 2
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Extends the Ship class to model a vessel designed for carrying 
 * heavy goods. Includes specific attributes such as cargo type, loading 
 * methods, and total cargo value.
 */
package assignment4.project2;

/**
 * Class that extends a regular ship to be able to hold cargo
 * [Represents a cargo ship]
 */
public class CargoShip extends Ship {
	
	// Properties of a cargo ship
	private String cargoType, loadingMethod, contraband;
	private int numberOfCranes;
	private double cargoValue;
	
	/**
	 * Default constructor
	 */
	public CargoShip() {
		super(); // Call base default constructor
		cargoType = "";
		loadingMethod = "";
		contraband = "";
		numberOfCranes = 0;
		cargoValue = 0.0;
	}
	
	/**
	 * Overload constructor
	 * @param floating whether the ship is floating
	 * @param capacity max number of people
	 * @param length length of ship
	 * @param width width of ship
	 * @param height height of ship
	 * @param name name of ship
	 * @param origin origin of ship
	 * @param departureDate date when the ship departs
	 * @param arrivalDate date when the ship arrives
	 * @param departingPort the port the ship will depart from
	 * @param arrivalPort the port the ship will arrive to
	 * @param owner the owner of the ship
	 * @param cargoType the type of cargo on the ship
	 * @param loadingMethod the loading method for the cargo
	 * @param contraband the contraband in the cargo
	 * @param numberOfCranes the number of cranes
	 * @param cargoValue the value of the cargo
	 */
	public CargoShip(boolean floating, int capacity, double length, double width, double height, 
			String name, String origin, String departureDate, String arrivalDate, 
			String departingPort, String arrivalPort, String owner, 
			String cargoType, String loadingMethod, String contraband, int numberOfCranes, double cargoValue) { 
		
		// Call base overload constructor
		super(floating, capacity, length, width, height, name, origin, departureDate, arrivalDate, 
				departingPort, arrivalPort, owner);
		
		this.cargoType = cargoType;
		this.loadingMethod = loadingMethod;
		this.contraband = contraband;
		this.numberOfCranes = numberOfCranes;
		this.cargoValue = cargoValue;
	}
	
	// MUTATOR METHODS
	//__________________________________________________
	
	/**
	 * Sets the type of cargo
	 * @param cargoType new type of cargo
	 */
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	
	/**
	 * Sets the loading method
	 * @param loadingMethod new loading method
	 */
	public void setLoadingMethod(String loadingMethod) {
		this.loadingMethod = loadingMethod;
	}
	
	/**
	 * Sets the contraband
	 * @param contraband new contraband
	 */
	public void setContraband(String contraband) {
		this.contraband = contraband;
	}
	
	/**
	 * Sets the number of cranes
	 * @param numberOfCranes new number of cranes
	 */
	public void setNumberOfCranes(int numberOfCranes) {
		this.numberOfCranes = numberOfCranes;
	}
	
	/**
	 * Sets the value of the cargo
	 * @param cargoValue new value of the cargo
	 */
	public void setCargoValue(double cargoValue) {
		this.cargoValue = cargoValue;
	}
	
	// ACCESSOR METHODS
	//__________________________________________________
	
	/**
	 * Retrieves the type of cargo
	 * @return the type of cargo
	 */
	public String getCargoType() {
		return cargoType;
	}
	
	/**
	 * Retrieves the loading method
	 * @return the loading method
	 */
	public String getLoadingMethod() {
		return loadingMethod;
	}
	
	/**
	 * Retrieves the contraband
	 * @return the contraband
	 */
	public String getContraband() {
		return contraband;
	}
	
	/**
	 * Retreives the number of cranes
	 * @return the number of cranes
	 */
	public int getNumberOfCranes() {
		return numberOfCranes;
	}
	
	/**
	 * Retrieves the value of the cargo
	 * @return the value of the cargo
	 */
	public double getCargoValue() {
		return cargoValue;
	}
	
	/**
	 * Prints all the information of the ship
	 */
	@Override
	public void print() {
		super.print(); // Call base print method
		System.out.printf("CARGO CONDITIONS\n"
						+ "-----\n"
						+ "Cargo Type: %s\n"
						+ "Loading Method: %s\n"
						+ "Contraband: %s\n"
						+ "Number of Cranes: %d cranes\n"
						+ "Cargo Value: $%.2f\n"
						+ "=========================================\n",
						cargoType, loadingMethod, contraband, numberOfCranes, cargoValue);
	}
	
	/**
	 * Compiles all the information of the ship into a single string
	 * @return the information of the ship
	 */
	@Override
	public String toString() {
		String str = super.toString() // Call base toString method
				+ "CARGO CONDITIONS\n"
				+ "-----\n"
				+ "Cargo Type: " + cargoType + "\n"
				+ "Loading Method: " + loadingMethod + "\n"
				+ "Contraband: " + contraband + "\n"
				+ "Number of Cranes: " + numberOfCranes + " cranes\n"
				+ "Cargo Value: $" + cargoValue + "\n"
				+ "=========================================\n";
		
		return str;
	}
	
}
