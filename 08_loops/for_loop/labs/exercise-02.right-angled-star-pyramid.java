// Exercise 02: Right-Angled Star Pyramid
public class RightAngledStarPyramid {
    public static void main(String[] args) {

        // Number of rows
        int rows = 5;

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
