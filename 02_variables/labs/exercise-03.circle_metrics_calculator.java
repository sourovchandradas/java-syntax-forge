// Exercise 03: Circle Metrics Calculator 

public class CircleMetricsCalculator {
    public static void main(String[] args) {

        // Constant value of PI
        final double PI = 3.14159;

        // Radius of the circle
        double radius = 7.5;

        // Calculate circumference: 2 × PI × radius
        double circumference = 2 * PI * radius;

        // Calculate area: PI × radius²
        double area = PI * radius * radius;

        // Print the results
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
