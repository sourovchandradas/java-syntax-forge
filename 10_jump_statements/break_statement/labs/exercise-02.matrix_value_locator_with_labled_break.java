// Exercise 02: Matrix Value Locator with Labeled Break
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90 }
        };
        int target = 50;
        boolean found = false;

        searchLoop:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    System.out.println("Found " + target + " at position [" + row + "][" + col + "]");
                    found = true;
                    break searchLoop; // Terminate outer and inner loops
                }
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }
}
