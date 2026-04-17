import java.util.Scanner;

public class FactorAnalysis {

    // Method to find factors and return as array
    public static int[] getFactors(int number) {
        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array based on count
        int[] factors = new int[count];

        // Second loop to store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int getSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long getProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double getSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get factors
        int[] factors = getFactors(number);

        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculate results
        int sum = getSum(factors);
        long product = getProduct(factors);
        double sumSquares = getSumOfSquares(factors);

        // Display results
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        // Close scanner
        input.close();
    }
}