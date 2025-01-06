package Calculator;

import java.util.Scanner;

public class Calcuator {


 // Method to add two numbers
 public static double add(double a, double b) {
    return a + b;
}

//Method to substract two numbers
public static double subtract(double a, double b) {
    return a - b;
}


// Method to multiply two numbers
public static double multiply(double a, double b) {
    return a * b;
}


 // Method to divide two numbers
 public static double divide(double a, double b) {
    if (b == 0) {
        System.out.println("Error: Division by zero is not allowed.");
        return 0;
    }
    return a / b;
}

    public static void main(String[] args) {
        System.out.println("welcome to my calculator::");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result;


        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (num2 != 0) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }


        
    }
}
