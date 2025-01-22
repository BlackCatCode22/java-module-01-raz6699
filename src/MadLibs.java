// MadLibs.java
// A program that takes user input for a noun, verb, adjective, and other words to create a funny story.

import java.util.Scanner; // Import the Scanner class to read user input

public class MadLibs {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a series of words
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        // Create a mad libs story by substituting the user's input into a predefined template
        String story = "Once upon a time, a " + adjective + " " + noun + " decided to " + verb + " in the " + place + ".\n"
                + "It found a " + noun2 + " along the way and had the adventure of a lifetime!";

        // Display the resulting story
        System.out.println("\nHere’s your Mad Libs story:\n");
        System.out.println(story);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
