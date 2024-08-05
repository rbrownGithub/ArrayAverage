package org.example;

public class ArrayAverage {
    /**
     * Calculates the average of an array of integers.
     * @param numbers The input array of integers.
     * @return The average of the numbers in the array as a double.
     * @throws IllegalArgumentException if the input array is null.
     */
    public static double calculateAverage(int[] numbers) {
        // Check if the input array is null to prevent NullPointerException
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int sum = 0; // Initialize sum to store the total of all numbers

        // Iterate through each number in the array and add it to the sum
        for (int num : numbers) {
            sum += num;
        }

        // Calculate and return the average
        // Cast sum to double to ensure floating-point division
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Create a test array with the numbers 1, 2, 3, 4, 5
        int[] testArray = {1, 2, 3, 4, 5};

        // Call the calculateAverage method and store the result
        double average = calculateAverage(testArray);

        // Print the calculated average
        System.out.println("Average: " + average);

        // Uncomment the following lines to test null input handling
        // int[] nullArray = null;
        // double nullAverage = calculateAverage(nullArray);
    }
}