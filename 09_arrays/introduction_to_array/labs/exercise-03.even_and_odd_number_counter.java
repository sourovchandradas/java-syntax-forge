// Exercise 03: Even and Odd Number Counter
public class EvenAndOddNumberCounter {
    public static void main(String[] args) {

        // Initialize the array
        int arr[] = {20, 142, 19, 13, 94};

        // Start from the last index of the array
        int length = arr.length - 1;

        // Variables to count even and odd numbers
        int even = 0;
        int odd = 0;

        // Traverse the array from end to beginning
        while (length >= 0) {

            // Check if the current element is even
            if (arr[length] % 2 == 0) {
                even++;    // Increase even counter
            } else {
                odd++;     // Increase odd counter
            }

            // Move to the previous element
            length--;
        }

        // Display the total even numbers
        System.out.println("Even Number : " + even);

        // Display the total odd numbers
        System.out.println("Odd Number : " + odd);
    }
}
