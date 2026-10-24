// Exercise 02: Array Element Reversal
public class ArrayElementReversal {
    public static void main(String[] args) {

        // Initialize the array
        int arr[] = { 1, 2, 3, 4, 5};

        // Two Pointers:
        // left starts from the beginning
        // right starts from the end
        int left = 0;
        int right = arr.length - 1;
         
        // Continue swapping until the pointers meet
        while (left < right) {

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }

        // Point the reversed array
        System.out.print("Reversed Array : ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
