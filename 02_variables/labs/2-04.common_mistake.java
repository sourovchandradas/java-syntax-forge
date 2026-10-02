// Exercise 2-04: Common Mistake
public class Exercise4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // MISTAKE: Without parentheses, Java evaluates left-to-right.
        // Step 1: "The sum is: " + 5  -> "The sum is: 5"
        // Step 2: "The sum is: 5" + 10 -> "The sum is: 510"
        System.out.println("Without parentheses\t: " + a + b); // Output: The sum is: 510

        // CORRECT: Parentheses force addition (a + b) to evaluate first.
        // Step 1: (5 + 10)            -> 15
        // Step 2: "The sum is: " + 15 -> "The sum is: 15"
        System.out.println("With parentheses\t: " + (a + b));   // Output: The sum is: 15
    }
}
