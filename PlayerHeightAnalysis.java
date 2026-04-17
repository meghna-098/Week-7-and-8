import java.util.Random;

public class PlayerHeightAnalysis {

    // Method to calculate sum of heights
    public static int getSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double getMean(int[] heights) {
        int sum = getSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int getShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int getTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        // Define array size and height range
        int numberOfPlayers = 11;
        int minHeight = 150;
        int maxHeight = 250;

        // Create array to store heights
        int[] heights = new int[numberOfPlayers];

        // Create Random object
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(maxHeight - minHeight + 1) + minHeight;
        }

        // Display all heights
        System.out.print("Player Heights (cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        // Calculate results
        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        // Display results
        System.out.println("\n\nTotal Height: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}