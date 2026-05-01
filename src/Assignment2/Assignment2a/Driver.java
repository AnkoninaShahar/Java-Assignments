/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 2a, Project 1
 * Due Date: 05/03/2026
 * Date Submitted: 05/01/2026
 *
 * Description: Creates and prints the information of 
 * 				3 people to test the Person class.
 */
package Assignment2.Assignment2a;

import java.util.Scanner;

public class Driver {
	
    static Scanner s1 = new Scanner(System.in); // A static Scanner field used to receive information
    
    // Start of program
    public static void main(String[] args)
    {
        Driver d1 = new Driver(); // An instance of this object
        
        // Person 1
        Person Stacey = d1.readValue();
        Stacey.print();
        
        // Person 2
        Person Ross = d1.readValue();
        Ross.print();
        
        // Person 3
        Person Mia = d1.readValue();
        Mia.print();
    }
    
    /**
     * Prompts user for values and creates a Person using the inputed values
     * @return The person containing the inputed values
     */
    public Person readValue() {
    	// All the variables used to create a person
    	String name = "", address = "", phoneNumber = "";
    	int age = 0;
    	
    	// Prompts user for information and stores that information in the variables
    	System.out.printf("Enter name: ");
    	name = s1.nextLine();
    	System.out.printf("Enter address: ");
    	address = s1.nextLine();
    	System.out.printf("Enter age: ");
    	age = s1.nextInt();
    	s1.nextLine();
    	System.out.printf("Enter phone number: ");
    	phoneNumber = s1.nextLine();
    	
    	// Returns the person created
        return new Person(name, address, age, phoneNumber);
    }
}

