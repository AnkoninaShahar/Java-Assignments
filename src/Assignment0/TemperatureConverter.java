/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab -1, Project 2
 * Due Date: 04/17/2026
 * Date Submitted: 04/08/2026
 *
 * Description: Converts temperatures between Celsius and
 *              Fahrenheit in both directions based on user input.
 */
package Assignment0;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner initialization
        float celsius, fahrenheit; // variables to store the Celsius and Fahrenheit

        System.out.printf("=== Temperature Converter ===\n\n"); // Prints title of process
        
        // Prompts user for temperature in Celsius and reads input
        System.out.printf("Enter a temperature in Celsius: ");
        celsius = in.nextFloat();
        fahrenheit = 32 + (celsius * 180.0f / 100.0f); // Converts the temperature to Fahrenheit
        
        System.out.printf("%.2f\u00B0C = %.2f\u00B0F%n\n", celsius, fahrenheit); // Prints result
        
        // Prompts user for temperature in Fahrenheit and reads input
        System.out.printf("Enter a temperature in Fahrenheit: ");
        fahrenheit = in.nextFloat();
        celsius = (fahrenheit - 32) * 100.0f / 180.0f; // Converts the temperature to Celsius

        System.out.printf("%.2f\u00B0F = %.2f\u00B0C%n", fahrenheit, celsius); // Prints result

        in.close(); // Closes scanner
    }
}
