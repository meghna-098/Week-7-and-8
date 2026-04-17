import java.util.Scanner;

public class NumberCheckerr {

    // Method to count digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;

        if (number == 0) return 1;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        number = Math.abs(number);
        int index = count - 1;

        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int getSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double getSumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshad(int number) {
        int[] digits = getDigits(number);
        int sum = getSum(digits);

        if (sum == 0) return false;

        return number % sum == 0;
    }

    // Method to find frequency of digits using 2D array
    public static int[][] getFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initialize digits column (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;   // digit
            frequency[i][1] = 0;   // frequency
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits
        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        // Sum of digits
        int sum = getSum(digits);
        System.out.println("\nSum of digits: " + sum);

        // Sum of squares
        double sumSquares = getSumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Harshad check
        System.out.println("Is Harshad Number? " + isHarshad(number));

        // Frequency
        int[][] freq = getFrequency(digits);
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
            }
        }

        // Close scanner
        input.close();
    }
}