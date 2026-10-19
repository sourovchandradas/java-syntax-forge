// Exercise 02: Array Search Early Return
public class FirstNegativeFinder {

    public static int findFirstNegativeIndex(int[] numbers) {
        if (numbers == null) {
            return -1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i; // Early exit upon discovery ($O(1)$ best-case)
            }
        }

        return -1; // Fallback if no negative value found
    }

    public static void main(String[] args) {
        int[] data1 = {10, 25, -4, 18, -30};
        int[] data2 = {5, 12, 80, 4};

        System.out.println("Index in data1: " + findFirstNegativeIndex(data1));
        System.out.println("Index in data2: " + findFirstNegativeIndex(data2));
    }
}
