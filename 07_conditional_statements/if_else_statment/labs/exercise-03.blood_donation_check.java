//  Exercise 03: Blood Donation Check

public class BloodDonationCheck {
    public static void main(String[] args) {
        int age = 23;
        double weight = 53.5;

        if (age >= 18) {
            if (weight >= 50.0) {
                System.out.println("Eligible to donate.");
            } else {
                System.out.println("You must weight at least 50 kilograms to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}
