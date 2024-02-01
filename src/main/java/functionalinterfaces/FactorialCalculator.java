package functionalinterfaces;

import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate factorial
    public static long calculateFactorial(int number) {
        // Base case: Factorial of 0 and 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }

        // Initialize result to 1
        long result = 1;

        // Calculate factorial using loop
        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        scanner.close();

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
