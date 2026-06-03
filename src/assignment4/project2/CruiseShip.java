/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 2
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Extends the Ship class to represent a passenger vessel. 
 * Adds attributes for ticket pricing, room counts, and an array of 
 * onboard services to demonstrate complex object inheritance.
 */
package assignment4.project2;

/**
 * Class that extends a regular ship to be able to hold more people and activities
 * [Represents a cruise ship]
 */
public class CruiseShip extends Ship{
	
	// Properties of a cargo ship
	double ticketPrice;
	int numberOfRooms;
	String buffetMenu, cruiseType;
	String[] services;
	
	/**
	 * Default constructor
	 */
	public CruiseShip() {
		super(); // Call base default constructor
		ticketPrice = 0.0;
		numberOfRooms = 0;
		buffetMenu = "";
		cruiseType = "";
		services = new String[0];
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
	 * @param ticketPrice the price of a ticket
	 * @param numberOfRooms the number of rooms
	 * @param buffetMenu the menu for the buffet
	 * @param cruiseType the type of cruise
	 * @param services a list of services available
	 */
	public CruiseShip(boolean floating, int capacity, double length, double width, double height, 
			String name, String origin, String departureDate, String arrivalDate, 
			String departingPort, String arrivalPort, String owner, 
			double ticketPrice, int numberOfRooms, String buffetMenu, String cruiseType, String[] services) { 
		
		// Call base overload constructor
		super(floating, capacity, length, width, height, name, origin, departureDate, arrivalDate, 
				departingPort, arrivalPort, owner);
		
		this.ticketPrice = ticketPrice;
		this.numberOfRooms = numberOfRooms;
		this.buffetMenu = buffetMenu;
		this.cruiseType = cruiseType;
		
		// Check to ensure services isn't null
		this.services = (services != null) ? services : new String[0];
	}
	
	// MUTATOR METHODS
	//__________________________________________________
	
	/**
	 * Sets the price of tickets
	 * @param ticketPrice new price of tickets
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	/**
	 * Sets the number of rooms
	 * @param numberOfRooms new number of rooms
	 */
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	/**
	 * Sets the buffet menu
	 * @param buffetMenu new buffet menu
	 */
	public void setBuffetMenu(String buffetMenu) {
		this.buffetMenu = buffetMenu;
	}
	
	/**
	 * Sets the type of cruise
	 * @param cruiseType new type of cruise
	 */
	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}
	
	/**
	 * Sets the list of services
	 * @param services new list of services
	 */
	public void setServices(String[] services) {
		this.services = services;
	}
	
	// ACCESSOR METHODS
	//__________________________________________________
	
	/**
	 * Retrieves the price of tickets
	 * @return the price of tickets
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	/**
	 * Retrieves the number of rooms 
	 * @return the number of rooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	/**
	 * Retrieves the buffet menu
	 * @return the buffet menu
	 */
	public String getBuffetMenu() {
		return buffetMenu;
	}
	
	/**
	 * Retrieves the type of cruise
	 * @return the type of cruise
	 */
	public String getCruiseType() {
		return cruiseType;
	}
	
	/**
	 * Retrieves list of services
	 * @return the list of services
	 */
	public String[] getServices() {
		return services;
	}
	
	/**
	 * Prints all the information of the ship
	 */
	@Override
	public void print() {
		super.print(); // Call base print method
		System.out.printf("CRUISE CONDITIONS\n"
						+ "-----\n"
						+ "Ticket Price: $%.2f\n"
						+ "Number of Rooms: %d rooms\n"
						+ "Buffet Menu: %s\n"
						+ "cruiseType: %s\n", 
						ticketPrice, numberOfRooms, buffetMenu, cruiseType);
		
		System.out.printf("Services:\n");
		for (int i = 0; i < services.length; i++) {
			System.out.printf(" - %s\n", services[i]);
		}
		System.out.printf("=========================================\n");
	}
	
	/**
	 * Compiles all the information of the ship into a single string
	 * @return the information of the ship
	 */
	@Override
	public String toString() {
		String str = super.toString() // Call base toString method
				+ "CRUISE CONDITIONS\n"
				+ "-----\n"
				+ "Ticket Price: $" + ticketPrice + "\n"
				+ "Number of Rooms: " + numberOfRooms + " rooms\n"
				+ "Buffet Menu: " + buffetMenu + "\n"
				+ "cruiseType: " + cruiseType + "\n"
				+ "Services:\n";
		
		for (int i = 0; i < services.length; i++) {
			str += " - " + services[i] + "\n";
		}
		
		return str;
	}
}
