// Exercise-03: Sum Until Threshold Reached
public class SumUntilThreshold {
    public static void main(String[] args) {

        // Starting number
        int number = 1;

        // Variable to store the sum
        int sum = 0;

        do {
            // Add the square of the current number to sum
            sum = sum + (number * number);

            // Move to the next number
            number++;

        } while (sum <= 100);

        // Print the final sum
        System.out.println("Sum = " + sum);
    }
}
