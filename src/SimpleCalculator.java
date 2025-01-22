// SimpleCalculator.java
// A program that performs basic arithmetic operations (addition, subtraction, multiplication, division) on two numbers.

import java.util.Scanner; // Import the Scanner class to read user input

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;            // Addition
        double difference = num1 - num2;     // Subtraction
        double product = num1 * num2;        // Multiplication
        double quotient = num1 / num2;       // Division

        // Output the results of the operations
        System.out.printf("Sum: %.2f + %.2f = %.2f\n", num1, num2, sum);
        System.out.printf("Difference: %.2f - %.2f = %.2f\n", num1, num2, difference);
        System.out.printf("Product: %.2f * %.2f = %.2f\n", num1, num2, product);

        // Check if the second number is not zero before performing division
        if (num2 != 0) {
            System.out.printf("Quotient: %.2f / %.2f = %.2f\n", num1, num2, quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
