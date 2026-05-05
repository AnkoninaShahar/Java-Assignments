/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 2, Project 1
 * Due Date: 05/03/2026
 * Date Submitted: 05/01/2026
 *
 * Description: Creates and prints the information of 
 * 				3 people to test the Person class.
 */

/* Design
   1. Variables: 
      - name (String): Stores the person's full name.
      - address (String): Stores the person's physical address.
      - age (int): Stores the person's age.
      - phoneNumber (String): Stores the person's contact number.
      - d1 (Driver): Instance of the driver class used to call the non-static readValue() method.
      - Stacey, Ross, Mia (Person): Object instances used to store and display the data for three different people.

   2. Input: 
      - The program uses the Scanner class to read keyboard input.
      - It prompts the user for a String (name), another String (address), an int (age), and a final String (phone number).
      - scanner.nextLine() is used after scanner.nextInt() to clear the newline character from the buffer to ensure the next name input isn't skipped.

   3. Processing: 
      - The main method instantiates the Driver and calls the readValue() method three times.
      - The readValue() method collects the data and uses the overloaded constructor of the Person class to create a new object.
      - The newly created Person object is returned to the main method.

   4. Output: 
      - The print() method in the Person class is called for each object.
      - It displays all person attributes (Name, Address, Age, Phone) clearly in the console using formatted print statements.
*/

package assignment2.project1;

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

