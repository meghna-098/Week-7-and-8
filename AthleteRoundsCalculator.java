import java.util.Scanner;

// Class to calculate number of rounds in a triangular park
class AthleteRoundsCalculator {

    // Method to calculate rounds needed to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {

        // Calculate perimeter of triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run = 5 km = 5000 meters
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for triangle sides
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Validate input
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input! Sides must be positive.");
        } else {

            // Call method
            double rounds = calculateRounds(side1, side2, side3);

            // Display result
            System.out.println("Number of rounds required to complete 5 km run = " + rounds);
        }

        // Close scanner
        input.close();
    }
}