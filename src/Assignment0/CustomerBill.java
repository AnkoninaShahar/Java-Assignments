/*
 * Name: Shahar Ankonina
 * Class: CIS 35A
 * Assignment: Lab -1, Project 1
 * Due Date: 04/17/2026
 * Date Submitted: 04/08/2026
 *
 * Description: Customer billing system for five products.
 *              Reads quantities, calculates totals, applies
 *              sales tax, and prints a formatted receipt.
 */
package Assignment0;

import java.util.Scanner;

public class CustomerBill {

    public static void main(String[] args) {

        // Constants — unit prices and tax rate
        final double PRICE_TV             = 400.00;
        final double PRICE_VCR            = 220.00;
        final double PRICE_REMOTE         = 35.20;
        final double PRICE_CD             = 300.00;
        final double PRICE_TAPE           = 150.00;
        final double TAX_RATE             = 0.0825;
		
        // Variables to store the quantity of each product
		int qtyTV = 0;
		int qtyVCR = 0;
		int qtyRemote = 0;
		int qtyCD = 0;
		int qtyTape = 0;
		
		// Variables to store the total price of each purchase
		float tpTV = 0f;
		float tpVCR = 0f;
		float tpRemote = 0f;
		float tpCD = 0f;
		float tpTape = 0f;
		
		// The sub total, tax, and grand total of the final purchase
		float subtotal = 0f;
		float tax = 0f;
		float total = 0f;
		
		Scanner in = new Scanner(System.in);	// Scanner initialization
		
		// Prompts user for number of TV's bought and reads input
		System.out.printf("How many TV's were sold?\n");
		qtyTV = in.nextInt();
		tpTV = qtyTV * (float)PRICE_TV; // Calculates the total price
		
		// Prompts user for number of VCR's bought and reads input
		System.out.printf("How many VCR's were sold?\n");
		qtyVCR = in.nextInt();
		tpVCR = qtyVCR * (float)PRICE_VCR; // Calculates the total price
		
		// Prompts user for number of remote controller's bought and reads input
		System.out.printf("How many remote controller's were sold?\n");
		qtyRemote = in.nextInt();
		tpRemote = qtyRemote * (float)PRICE_REMOTE; // Calculates the total price
		
		// Prompts user for number of CD's bought and reads input
		System.out.printf("How many CD's were sold?\n");
		qtyCD = in.nextInt();
		tpCD = qtyCD * (float)PRICE_CD; // Calculates the total price
		
		// Prompts user for number of tape recorder's bought and reads input
		System.out.printf("How many Tape Recorder's were sold?\n");
		qtyTape = in.nextInt();
		tpTape = qtyTape * (float)PRICE_TAPE; // Calculates the total price
		
		// Calculates the sub total, tax, and grand total
		subtotal = tpTV + tpVCR + tpRemote + tpCD + tpTape;
		tax = subtotal * (float)TAX_RATE;
		total = subtotal + tax;
		
		// Prints output
		System.out.printf("====================================================\n");
		System.out.printf("  QTY   DESCRIPTION          UNIT PRICE  TOTAL PRICE\n");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("%5d   %-20s%10.2f  %10.2f\n", qtyTV, "TV", PRICE_TV, tpTV);
		System.out.printf("%5d   %-20s%10.2f  %10.2f\n", qtyVCR, "VCR", PRICE_VCR, tpVCR);
		System.out.printf("%5d   %-20s%10.2f  %10.2f\n", qtyRemote, "Remote Controller", PRICE_REMOTE, tpRemote);
		System.out.printf("%5d   %-20s%10.2f  %10.2f\n", qtyCD, "CD Player", PRICE_CD, tpCD);
		System.out.printf("%5d   %-20s%10.2f  %10.2f\n", qtyTape, "Tape Recorder", PRICE_TAPE, tpTape);
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("                               SUBTOTAL:%10.2f\n", subtotal);
		System.out.printf("                                    TAX:%10.2f\n", tax);
		System.out.printf("                                  TOTAL:%10.2f\n", total);
		System.out.printf("====================================================");
		
		in.close(); // Closes scanner
	}
}
