// Exercise 01: Linear Search Fast Exit
public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {12, 45, 67, 89, 23, 90, 34};
        int target = 89;
        int foundIndex = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                foundIndex = i;
                break; // Fast exit upon discovery
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not present in dataset.");
        }
    }
}
