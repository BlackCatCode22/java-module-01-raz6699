// TempConverter.java
// A program that converts a temperature from Fahrenheit to Celsius.

import java.util.Scanner; // Import the Scanner class to read user input

public class TempConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the temperature as a double (to allow for decimal values)
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: Celsius = (Fahrenheit - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result with formatted output
        System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
