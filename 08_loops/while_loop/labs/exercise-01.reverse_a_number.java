// Exercise 01: Reverse a Number
public class ReverseNumber {
    public static void main(String[] args) {

        // Original number
        int num = 1234;

        // Variable to store reversed number
        int reverse = 0;

        // Repeat until num becomes 0
        while (num != 0) {

            // Get the last digit
            int digit = num % 10;

            // Add digit to reverse number
            reverse = reverse * 10 + digit;

            // Remove the last digit from num
            num = num / 10;
        }

        // Print the reversed number
        System.out.println(reverse);
    }
}
