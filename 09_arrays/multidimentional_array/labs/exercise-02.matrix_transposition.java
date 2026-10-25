// Exercise 02: Matrix Transposition
public class Main {
    public static void main(String[] args) {

        // Initialize a 2x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Create a 3x2 transpose matrix
        int[][] transpose = new int[3][2];

        // Generate the transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                // Swap row and column indices
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("\nTranspose Matrix:");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
