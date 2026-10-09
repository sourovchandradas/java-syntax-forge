public class EvenPositiveCheck {
    public static void main(String[] args) {
        int number = 14;

        String result = (number > 0 && number % 2 == 0) ? "Positive Even" : "Other";
        System.out.println("Result: " + result); // Output: Positive Even
    }
}
