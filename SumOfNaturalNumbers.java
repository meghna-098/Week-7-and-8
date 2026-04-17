import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum using recursion
    public static int recursiveSum(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {

            // Calculate sum using recursion
            int recursiveResult = recursiveSum(number);

            // Calculate sum using formula
            int formulaResult = formulaSum(number);

            // Display results
            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula: " + formulaResult);

            // Compare both results
            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("Mismatch in results!");
            }
        }

        // Close scanner
        input.close();
    }
}