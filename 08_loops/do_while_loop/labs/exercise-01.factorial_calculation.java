// Exercise 01: Factorial Calculation
public class FactorialExample {
    public static void main(String[] args) {

        // Number whose factorial will be calculated
        int n = 5;

        // Variable to store factorial result
        int factorial = 1;

        do {
            // Multiply factorial by current value of n
            factorial = factorial * n;

            // Decrease n by 1
            n--;
        } while (n > 0);

        // Print the factorial
        System.out.println(factorial);
    }
}
