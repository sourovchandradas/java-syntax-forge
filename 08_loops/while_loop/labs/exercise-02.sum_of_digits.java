// Exercise 02: Sum of Digits
public class SumOfDigits {
    public static void main(String[] args) {

        // Original number
        int num = 54321;

        // Variable to store the sum of digits
        int sum = 0;

        // Repeat until all digits are processed
        while (num != 0) {

            // Extract the last digit
            int digit = num % 10;

            // Add the digit to sum
            sum = sum + digit;

            // Remove the last digit from num
            num = num / 10;
        }

        // Print the final sum
        System.out.println(sum);
    }
}
