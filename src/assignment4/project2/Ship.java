/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 2
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Defines a base Ship class with core maritime properties including 
 * capacity, dimensions, and port information. Serves as the parent class 
 * for the specialized vessel hierarchy.
 */
package assignment4.project2;

/**
 * Class that represents a ship
 */
public class Ship {
	
	// Properties of a ship
	private boolean floating;
	private int capacity;
	private double length, width, height;
	private String name, origin, departureDate, arrivalDate, departingPort, arrivalPort, owner;
	
	/**
	 * Default constructor
	 */
	public Ship() {
		floating = false;
		capacity = 0;
		
		length = 0;
		width = 0;
		height = 0;
		
		name = "";
		origin = "";
		
		departureDate = "";
		arrivalDate = "";
		
		departingPort = "";
		arrivalPort = "";
		
		owner = "";
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
	 */
	public Ship(boolean floating, int capacity, double length, double width, double height, 
			String name, String origin, String departureDate, String arrivalDate, 
			String departingPort, String arrivalPort, String owner) {
		this.floating = floating;
		this.capacity = capacity;
		
		this.length = length;
		this.width = width;
		this.height = height;
		
		this.name = name;
		this.origin = origin;
		
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		
		this.departingPort = departingPort;
		this.arrivalPort = arrivalPort;
		
		this.owner = owner;
	}
	
	// MUTATOR METHODS
	//__________________________________________________
	
	/**
	 * Sets the floating status
	 * @param floating new floating status
	 */
	protected void setFloating(boolean floating) {
		this.floating = floating;
	}
	
	/**
	 * Sets the capacity
	 * @param capacity new capacity
	 */
	protected void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * Sets the length of the ship
	 * @param length new length
	 */
	protected void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * Sets the width of the ship
	 * @param width new width
	 */
	protected void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Sets the height of the ship
	 * @param height new height
	 */
	protected void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Sets the name
	 * @param name new name
	 */
	protected void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the origin
	 * @param origin new origin
	 */
	protected void setOrigin(String origin) {
		this.origin = origin;
	}
	
	/**
	 * Sets the departure date
	 * @param departureDate new departure date
	 */
	protected void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
	/**
	 * Sets the arrival date
	 * @param arrivalDate new arrival date
	 */
	protected void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	/**
	 * Sets the departing port
	 * @param departingPort new departing port
	 */
	protected void setDepartingPort(String departingPort) {
		this.departingPort = departingPort;
	}
	
	/**
	 * Sets the arrival port
	 * @param arrivalPort new arrival port
	 */
	protected void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	
	/**
	 * Sets the owner
	 * @param owner new owner
	 */
	protected void setOwner(String owner) {
		this.owner = owner;
	}
	
	// ACCESSOR METHODS
	//__________________________________________________
	
	/**
	 * Retrieves the floating status
	 * @return the floating status
	 */
	protected boolean getFloating() {
		return floating;
	}
	
	/**
	 * Retrieves the capacity
	 * @return the capacity
	 */
	protected int getCapacity() {
		return capacity;
	}
	
	/**
	 * Retrieves the length
	 * @return the length
	 */
	protected double getLength() {
		return length;
	}
	
	/**
	 * Retrieves the width
	 * @return the width
	 */
	protected double getWidth() {
		return width;
	}
	
	/**
	 * Retrieves the height
	 * @return the height
	 */
	protected double getHeight() {
		return height;
	}
	
	/**
	 * Retrieves the name
	 * @return the name
	 */
	protected String getName() {
		return name;
	}
	
	/**
	 * Retrieves the origin
	 * @return the origin
	 */
	protected String getOrigin() {
		return origin;
	}
	
	/**
	 * Retrieves the departure date
	 * @return the departure date
	 */
	protected String getDepartureDate() {
		return departureDate;
	}
	
	/**
	 * Retrieves the arrival date
	 * @return the arrival date
	 */
	protected String getArrivalDate() {
		return arrivalDate;
	}
	
	/**
	 * Retrieves the departing port
	 * @return the departing port
	 */
	protected String getDepartingPort() {
		return departingPort;
	}
	
	/**
	 * Retrieves the arrival port
	 * @return the arrival port
	 */
	protected String getArrivalPort() {
		return arrivalPort;
	}
	
	/**
	 * Retrieves the owner
	 * @return the owner
	 */
	protected String getOwner() {
		return owner;
	}
	
	/**
	 * Prints all the information of the ship
	 */
	public void print() {
		System.out.printf("\n\n=========================================\n"
						+ "SHIP CONDITIONS\n"
						+ "-----\n"
						+ "Floating Status: %b\n"
						+ "Capacity: %d people\n"
						+ "Dimensions (l x w x h): %.2f x %.2f x %.2f\n"
						+ "Name and Origin: %s, %s\n"
						+ "Departing on %s at %s\n"
						+ "Arriving on %s at %s\n"
						+ "Owner: %s\n"
						+ "=========================================\n",
						floating, capacity, length, width, height, name, origin,
						departureDate, departingPort, arrivalDate, arrivalPort, owner);
	}
	
	/**
	 * Compiles all the information of the ship into a single string
	 * @return the information of the ship
	 */
	public String toString() {
		String str = 
				"\n\n=========================================\n"
				+ "SHIP CONDITIONS\n"
				+ "-----\n"
				+ "Floating Status: " + floating +"\n"
				+ "Capacity: " + capacity + " people\n"
				+ "Dimensions (l x w x h): " + length + " x " + width + " x " + height + "\n"
				+ "Name and Origin: " + name + ", " + origin + "\n"
				+ "Departing on " + departureDate + " at " + departingPort + "\n"
				+ "Arriving on " + arrivalDate + " at " + arrivalPort + "\n"
				+ "Owner: " + owner + "\n"
				+ "=========================================\n";
		
		return str;
	}
}
