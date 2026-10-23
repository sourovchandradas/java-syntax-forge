// Exercise 03: GCD Calculator(Euclidean Algorithm)
public class GCDExample {
    public static void main(String[] args) {

        // Two numbers
        int a = 48;
        int b = 18;

        // Find GCD using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // a now contains the GCD
        System.out.println("GCD = " + a);
    }
}
