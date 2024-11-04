/**
import java.util.*;

public class palindrome {
    public boolean palindrome(int m) {
        int n = m;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if (rev == m) {
            return true;
        } else {
            return false;
        }

    }

    public static void main() {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = in.nextInt();
        palindrome p = new palindrome();
        if (p.palindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
    }
}


*/

/**
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Display a menu of operations
        System.out.println("Scientific Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sine");
        System.out.println("6. Cosine");
        System.out.println("7. Tangent");
        System.out.println("8. Logarithm");
        System.out.println("9. Exponential");

        // Read user's choice
        int choice = in.nextInt();

        // Variables to store numbers and result
        double num1, num2, result = 0;

        // Perform operation based on user's choice
        switch (choice) {
            case 1:
                // Addition
                System.out.print("Enter first number: ");
                num1 = in.nextDouble();
                System.out.print("Enter second number: ");
                num2 = in.nextDouble();
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                // Subtraction
                System.out.print("Enter first number: ");
                num1 = in.nextDouble();
                System.out.print("Enter second number: ");
                num2 = in.nextDouble();
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                // Multiplication
                System.out.print("Enter first number: ");
                num1 = in.nextDouble();
                System.out.print("Enter second number: ");
                num2 = in.nextDouble();
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                // Division
                System.out.print("Enter numerator: ");
                num1 = in.nextDouble();
                System.out.print("Enter denominator: ");
                num2 = in.nextDouble();
                result = divide(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 5:
                // Sine function
                System.out.print("Enter angle in degrees: ");
                num1 = in.nextDouble();
                result = sine(num1);
                System.out.println("Sine(" + num1 + ") = " + result);
                break;
            case 6:
                // Cosine function
                System.out.print("Enter angle in degrees: ");
                num1 = in.nextDouble();
                result = cosine(num1);
                System.out.println("Cosine(" + num1 + ") = " + result);
                break;
            case 7:
                // Tangent function
                System.out.print("Enter angle in degrees: ");
                num1 = in.nextDouble();
                result = tangent(num1);
                System.out.println("Tangent(" + num1 + ") = " + result);
                break;
            case 8:
                // Logarithm
                System.out.print("Enter number: ");
                num1 = in.nextDouble();
                result = logarithm(num1);
                System.out.println("Logarithm(" + num1 + ") = " + result);
                break;
            case 9:
                // Exponential function
                System.out.print("Enter exponent: ");
                num1 = in.nextDouble();
                result = exponential(num1);
                System.out.println("Exponential(" + num1 + ") = " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }

        // Close the in to prevent resource leak
        in.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        // Adds two numbers and returns the result
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        // Subtracts second number from first and returns the result
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        // Multiplies two numbers and returns the result
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        // Divides first number by second and returns the result
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

    // Method to calculate sine of an angle
    public static double sine(double degrees) {
        // Converts degrees to radians and returns sine value
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    // Method to calculate cosine of an angle
    public static double cosine(double degrees) {
        // Converts degrees to radians and returns cosine value
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    // Method to calculate tangent of an angle
    public static double tangent(double degrees) {
        // Converts degrees to radians and returns tangent value
        double radians = Math.toRadians(degrees);
        return Math.tan(radians);
    }

    // Method to calculate natural logarithm
    public static double logarithm(double a) {
        // Returns natural logarithm of a positive number
        if (a > 0) {
            return Math.log(a);
        } else {
            System.out.println("Error: Logarithm of non-positive number");
            return 0;
        }
    }

    // Method to calculate exponential value
    public static double exponential(double a) {
        // Returns exponential (e^a)
        return Math.exp(a);
    }
    
}



*/
