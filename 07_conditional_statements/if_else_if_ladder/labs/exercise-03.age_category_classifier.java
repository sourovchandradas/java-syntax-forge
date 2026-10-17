// Exercise 03: Age Category Classifier
public class AgeCategorizer {
    public static void main(String[] args) {
        int age = 23;

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        }
    }
}
