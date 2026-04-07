package Assignment1;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        float fahrenheit, centigrade;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a temperature in Centigrade:");
        centigrade = in.nextFloat();
        fahrenheit = 32 + (centigrade * 180.0f / 100.0f);

        System.out.printf("%.2f degrees Centigrade is equal to %.2f degrees Fahrenheit.\n", centigrade, fahrenheit);
        
        System.out.println("Enter a temperature in Fahrenheit:");
        fahrenheit = in.nextFloat();
        centigrade = (fahrenheit - 32) * 100.0f / 180.0f;

        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Centigrade.\n", fahrenheit, centigrade);

        in.close();
    }
}
