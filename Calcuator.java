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

        
    }
}
