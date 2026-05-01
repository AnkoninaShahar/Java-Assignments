/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 2a, Project 1
 * Due Date: 05/03/2026
 * Date Submitted: 05/01/2026
 *
 * Description: Stores the name, address, phone number, and age of a person. 
 * 				Contains both a default and an overload constructor,
 * 				mutator and accessor methods, and a print method.
 */
package Assignment2.Assignment2a;

public class Person {
	// Fields used to store the persons information
	private String name, address, phoneNumber;
	private int age;
	
	/**
	 * Default constructor
	 */
	public Person() {
		// Sets every field to their default value
		name = "";
		address = "";
		age = 0;
		phoneNumber = "";
	}
	
	/**
	 * Overload Constructor
	 * @param name The person's name
	 * @param address The person's address
	 * @param age The person's age
	 * @param phoneNumber The person's phone number
	 */
	public Person(String name, String address, int age, String phoneNumber) {
		// Sets every field to the appropriate value
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	// Mutator Methods [Setters]
	// ___________________________________________
	
	/**
	 * Sets the name field
	 * @param name The new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the address field
	 * @param address The new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Sets the age field
	 * @param age The new age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Sets the phone number field
	 * @param phoneNumber The new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// Accessor Methods [Getters]
	// ___________________________________________
	
	/**
	 * Retrieves the name
	 * @return The name field
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the address
	 * @return The address field
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Retrieves the age
	 * @return The age field
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Retrieves the phone number
	 * @return The phone number field
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Prints out the information
	 */
	public void print() {
		System.out.printf("\n====================================\n"
						+ "NAME: %s\n"
						+ "ADDRESS: %s\n"
						+ "AGE: %d\n"
						+ "PHONE NUMBER: %s\n"
						+ "====================================\n\n", 
						name, address, age, phoneNumber);
	}
}

