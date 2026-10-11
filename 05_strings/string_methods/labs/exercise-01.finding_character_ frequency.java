//  Exercise 1: Finding Character Frequency

public class Exercise1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int count = 0;
        
        for (char c : text.toCharArray()) {
            if (c == 'o') {
                count++;
            }
        }
        
        System.out.println("Count of 'o': " + count); // Output: 2
    }
}
