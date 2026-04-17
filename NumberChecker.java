import java.util.Scanner;

public class NumberChecker {

    // Method to count digits
    public static int countDigits(int number) {
        number = Math.abs(number); // handle negative numbers
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

    // Method to check Duck Number
    // Duck number: contains at least one zero but should not start with zero
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }

    // Method to find smallest and second smallest digits
    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + secondSmallest);
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

        // Check Duck Number
        System.out.println("\nIs Duck Number? " + isDuckNumber(number));

        // Check Armstrong Number
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        // Largest & Second Largest
        findLargest(digits);

        // Smallest & Second Smallest
        findSmallest(digits);

        // Close scanner
        input.close();
    }
}