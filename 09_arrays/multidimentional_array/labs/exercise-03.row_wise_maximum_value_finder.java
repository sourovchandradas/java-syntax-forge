// Exercise 01: Row Wise Maximum Value Finder
public class RowWiseMaximumValueFinder {
    public static void main(String[] args) {

        // Initialize the matrix
        int[][] matrix = {
            {10, 25, 15},
            {45, 12, 30},
            {7, 50, 20}
        };

        // Traverse each row
        for (int i = 0; i < matrix.length; i++) {

            // Assume the first element of the row is the maximum
            int max = matrix[i][0];

            // Check the remaining elements in the row
            for (int j = 1; j < matrix[i].length; j++) {

                // Update max if a larger element is found
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            // Print the maximum value of the current row
            System.out.println("Maximum value of Row " + (i + 1) + ": " + max);
        }
    }
}
