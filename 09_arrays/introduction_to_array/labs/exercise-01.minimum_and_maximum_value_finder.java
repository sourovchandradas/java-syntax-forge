// Exercise 01: Minimum and Maximum Value Finder
public class Main {
    public static void main(String[] args) {

        // Initialize the array
        int arr[] = {45, 12, 89, 2, 67};

        // Assume the first element is both maximum and minimum
        int maximum = arr[0];
        int minimum = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {

            // Check if the current element is greater than maximum
            if (arr[i] > maximum) {
                maximum = arr[i]; // Update maximum value
            }

            // Check if the current element is smaller than minimum
            if (arr[i] < minimum) {
                minimum = arr[i]; // Update minimum value
            }
        }

        // Print the largest value
        System.out.println("Maximum Number : " + maximum);

        // Print the smallest value
        System.out.println("Minimum Number : " + minimum);
    }
}
