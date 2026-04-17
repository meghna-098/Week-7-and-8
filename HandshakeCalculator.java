import java.util.Scanner;

// Class to calculate maximum handshakes
class HandshakeCalculator {

    // Method to calculate handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        // Formula: n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.out.println("Invalid input! Number of students cannot be negative.");
        } else {
            // Call method
            int result = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("The maximum number of possible handshakes is " + result);
        }

        // Close scanner
        input.close();
    }
}