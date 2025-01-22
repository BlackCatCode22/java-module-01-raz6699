// SimpleInterest.java
// A program that calculates the simple interest based on user inputs for principal, rate, and time.

import java.util.Scanner; // Import the Scanner class to read user input

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest (as a percentage)
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period (in years)
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest using the formula:
        // Simple Interest = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.printf("The simple interest is: %.2f\n", simpleInterest);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
