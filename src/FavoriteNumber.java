// FavoriteNumber.java
// A program that prompts the user to enter their favorite number and prints it back along with a message.

import java.util.Scanner; // Import the Scanner class to read user input

public class FavoriteNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.print("Enter your favorite number: ");

        // Read the user's favorite number as an integer
        int favoriteNumber = scanner.nextInt();

        // Print a message with the user's favorite number
        System.out.println("Your favorite number is " + favoriteNumber + ". That's a great choice!");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
