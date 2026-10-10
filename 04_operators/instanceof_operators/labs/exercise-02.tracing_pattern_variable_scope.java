// Exercise 02: Tracing Pattern Variable Scope

public class EvenPositiveCheck {
    public static void main(String[] args) {
        Object data = "Pattern Matching";

        if (data instanceof String s && s.contains("Pattern")) {
            System.out.println("Matched: " + s.length());
        } else {
            System.out.println("No Match");
        }
    }
}
