/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab 4, Exercise 2
 * Due Date: 06/03/2026
 * Date Submitted: TBD
 *
 * Description: Demonstrates polymorphism by instantiating various Ship, 
 * CargoShip, and CruiseShip objects and storing them in a generic Ship array. 
 * Iterates through the array to invoke overridden print methods.
 */

/* Design
   1. Variables:
      - ships (Ship[]): A polymorphic array used to store different vessel types.
      - ship1, ship2, ship3 (Ship): Instances of the base class.
      - cargo1, cargo2 (CargoShip): Instances of the cargo subclass.
      - cruise1, cruise2 (CruiseShip): Instances of the cruise subclass.
      - services1, services2 (String[]): Arrays used to store onboard amenities.

   2. Input:
      - All vessel data (names, dimensions, capacities, specific subclass data) 
        is provided via parameterized constructors.

   3. Processing:
      - Objects of different types are assigned to the generic Ship array.
      - A for-loop iterates through the array.

   4. Output:
      - The overridden print() method for each specific class is called 
        dynamically, displaying unique ship data for each array element.
*/
package assignment4.project2;

/**
 * Class to test ship hierarchy
 */
public class ShipDriver {

	// Start of program
	public static void main(String[] args) {
		// SHIPS
		// _________________________________________________
		
		Ship ship1 = new Ship(true, 50, 150.5, 40.0, 25.0, "The Explorer", "London", 
                "06/01/2026", "06/15/2026", "Southampton", "New York", "Global Trek LLC");

		Ship ship2 = new Ship(true, 35, 120.0, 35.0, 20.0, "Sea Rover", "Lisbon", 
				"07/10/2026", "07/25/2026", "Lisbon", "Boston", "Atlantic Charters");
		
		Ship ship3 = new Ship(false, 0, 85.0, 25.0, 15.0, "Rusty Bucket", "Seattle", 
		        "N/A", "N/A", "Dry Dock", "N/A", "Salvage Co.");
		
		// CARGO SHIPS
		// _________________________________________________
		
		CargoShip cargo1 = new CargoShip(true, 20, 300.0, 60.0, 45.0, "Iron Giant", "Shanghai", 
		                           "05/20/2026", "06/10/2026", "Shanghai Port", "Los Angeles", "Maersk", 
		                           "Electronics", "Crane Lift", "None", 12, 5000000.00);
		
		CargoShip cargo2 = new CargoShip(true, 25, 250.0, 55.0, 40.0, "Bulk Carrier", "Hamburg", 
		                           "08/01/2026", "08/14/2026", "Hamburg", "Norfolk", "Hapag-Lloyd", 
		                           "Grain", "Conveyor Belt", "None", 8, 1200000.00);
		
		// CRUISE SHIPS
		// _________________________________________________
		
		String[] services1 = {"Spa", "Casino", "Theater", "Pool Deck"};
		CruiseShip cruise1 = new CruiseShip(true, 3500, 360.0, 47.0, 65.0, "Oceanic Queen", "Miami", 
		                              "07/04/2026", "07/11/2026", "Port of Miami", "Nassau", "Royal Caribbean", 
		                              899.99, 1500, "Continental & Seafood", "Luxury Leisure", services1);
		
		String[] services2 = {"Library", "Art Gallery", "Fine Dining"};
		CruiseShip cruise2 = new CruiseShip(true, 1200, 240.0, 32.0, 40.0, "Starlight Serenity", "Venice", 
		                              "09/15/2026", "09/22/2026", "Venice", "Dubrovnik", "Viking Cruises", 
		                              1500.00, 600, "Gourmet Italian", "Cultural Expedition", services2);
		
		// Shows polymorphism through array
		Ship[] ships = {ship1, ship2, ship3, cargo1, cargo2, cruise1, cruise2};
		
		// Prints out all values
		System.out.printf("=========================================");
		System.out.printf("       FLEET DEMONSTRATION");
		System.out.printf("=========================================");
		
		for (int i = 0; i < ships.length; i++) {
			ships[i].print();
		}

	}

}

/* TEST RUN
=========================================
       FLEET DEMONSTRATION
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 50 people
Dimensions (l x w x h): 150.50 x 40.00 x 25.00
Name and Origin: The Explorer, London
Departing on 06/01/2026 at Southampton
Arriving on 06/15/2026 at New York
Owner: Global Trek LLC
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 35 people
Dimensions (l x w x h): 120.00 x 35.00 x 20.00
Name and Origin: Sea Rover, Lisbon
Departing on 07/10/2026 at Lisbon
Arriving on 07/25/2026 at Boston
Owner: Atlantic Charters
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: false
Capacity: 0 people
Dimensions (l x w x h): 85.00 x 25.00 x 15.00
Name and Origin: Rusty Bucket, Seattle
Departing on N/A at Dry Dock
Arriving on N/A at N/A
Owner: Salvage Co.
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 20 people
Dimensions (l x w x h): 300.00 x 60.00 x 45.00
Name and Origin: Iron Giant, Shanghai
Departing on 05/20/2026 at Shanghai Port
Arriving on 06/10/2026 at Los Angeles
Owner: Maersk
=========================================
CARGO CONDITIONS
-----
Cargo Type: Electronics
Loading Method: Crane Lift
Contraband: None
Number of Cranes: 12 cranes
Cargo Value: $5000000.00
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 25 people
Dimensions (l x w x h): 250.00 x 55.00 x 40.00
Name and Origin: Bulk Carrier, Hamburg
Departing on 08/01/2026 at Hamburg
Arriving on 08/14/2026 at Norfolk
Owner: Hapag-Lloyd
=========================================
CARGO CONDITIONS
-----
Cargo Type: Grain
Loading Method: Conveyor Belt
Contraband: None
Number of Cranes: 8 cranes
Cargo Value: $1200000.00
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 3500 people
Dimensions (l x w x h): 360.00 x 47.00 x 65.00
Name and Origin: Oceanic Queen, Miami
Departing on 07/04/2026 at Port of Miami
Arriving on 07/11/2026 at Nassau
Owner: Royal Caribbean
=========================================
CRUISE CONDITIONS
-----
Ticket Price: $899.99
Number of Rooms: 1500 rooms
Buffet Menu: Continental & Seafood
cruiseType: Luxury Leisure
Services:
 - Spa
 - Casino
 - Theater
 - Pool Deck
=========================================


=========================================
SHIP CONDITIONS
-----
Floating Status: true
Capacity: 1200 people
Dimensions (l x w x h): 240.00 x 32.00 x 40.00
Name and Origin: Starlight Serenity, Venice
Departing on 09/15/2026 at Venice
Arriving on 09/22/2026 at Dubrovnik
Owner: Viking Cruises
=========================================
CRUISE CONDITIONS
-----
Ticket Price: $1500.00
Number of Rooms: 600 rooms
Buffet Menu: Gourmet Italian
cruiseType: Cultural Expedition
Services:
 - Library
 - Art Gallery
 - Fine Dining
=========================================

*/
