// CharDetails.java
// A program that takes a single character as input, displays its Unicode value, and checks if it's a letter or digit.

import java.util.Scanner; // Import the Scanner class to read user input

public class CharDetails {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single character
        System.out.print("Enter a single character: ");

        // Read the character input from the user
        char inputChar = scanner.next().charAt(0);

        // Display the Unicode value of the character
        int unicodeValue = inputChar;  // The character itself can be used to get its Unicode value

        System.out.println("Unicode value of '" + inputChar + "' is: " + unicodeValue);

        // Check if the character is a letter or a digit
        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is a letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println(inputChar + " is a digit.");
        } else {
            System.out.println(inputChar + " is neither a letter nor a digit.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
