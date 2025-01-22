// SimpleGreeting.java
// A program that asks the user for their name and prints a personalized greeting.

import java.util.Scanner; // Import the Scanner class to read user input

public class SimpleGreeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user input and store it in a variable
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the program.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
