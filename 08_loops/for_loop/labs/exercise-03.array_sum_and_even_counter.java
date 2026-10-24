// Exercise 03: Array Sum and Even Counter
public class ArraySumAndEvenCounter {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {10, 15, 20, 25, 30};

        // Variable to store the sum
        int sum = 0;

        // Variable to count even numbers
        int evenCount = 0;

        // Enhanced for loop to traverse the array
        for (int num : arr) {

            // Add the current element to the sum
            sum += num;

            // Check if the current element is even
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // Print the results
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Number of even elements: " + evenCount);
    }
}
