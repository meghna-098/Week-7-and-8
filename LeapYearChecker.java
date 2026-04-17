import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {

        // Condition:
        // (divisible by 4 AND not divisible by 100) OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if year is valid (Gregorian calendar starts from 1582)
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582.");
        } else {

            // Call method to check leap year
            boolean result = isLeapYear(year);

            // Display result
            if (result) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

        // Close scanner
        input.close();
    }
}