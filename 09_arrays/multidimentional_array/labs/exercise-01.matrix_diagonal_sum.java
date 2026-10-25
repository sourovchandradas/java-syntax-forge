// Exercise 01: Matrix Diagonal Sum
public class MatrixDiagonalSum {
    public static void main(String[] args) {

        // Initialize a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Variables to store the diagonal sums
        int primarySum = 0;
        int secondarySum = 0;

        // Traverse the matrix
        for (int i = 0; i < matrix.length; i++) {

            // Primary diagonal elements: matrix[i][i]
            primarySum += matrix[i][i];

            // Secondary diagonal elements: matrix[i][n-1-i]
            secondarySum += matrix[i][matrix.length - 1 - i];
        }

        // Print the results
        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
