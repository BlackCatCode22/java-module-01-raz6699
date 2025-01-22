// CircleArea.java
// A program that calculates the area of a circle given its radius entered by the user.

import java.util.Scanner; // Import the Scanner class to read user input

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius as a double (to allow for decimal values)
        double radius = scanner.nextDouble();

        // Calculate the area using the formula: Area = π * radius^2
        double area = Math.PI * radius * radius;

        // Print the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
