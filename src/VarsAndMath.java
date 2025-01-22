// VarsAndMath.java
// A program that demonstrates the use of primitive-type variables, arithmetic, and string concatenation.

public class VarsAndMath {
    public static void main(String[] args) {
        // Primitive variables
        int num1 = 10;               // Integer variable
        int num2 = 5;                // Another integer variable
        double price = 19.99;        // Double variable for floating-point numbers
        String productName = "Book"; // String variable to hold a product name

        // Arithmetic operations
        int sum = num1 + num2;       // Addition
        int difference = num1 - num2; // Subtraction
        int product = num1 * num2;    // Multiplication
        double division = price / num2; // Division (result as double)

        // String concatenation
        String message = "The product is " + productName + ", the total price is $" + price + ".";

        // Output results
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The division of price by num2 is: " + division);
        System.out.println(message);
    }
}
