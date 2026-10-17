public class DiscountEligibility {
    public static void main(String[] args) {
        boolean isPremiumMember = true;
        double purchaseAmount = 120.0;

        // Outer check: Membership status
        if (isPremiumMember) {
            // Inner check: Purchase amount threshold
            if (purchaseAmount >= 100.0) {
                System.out.println("20% Discount Applied.");
            } else {
                System.out.println("10% Discount Applied.");
            }
        } else {
            System.out.println("No Discount Available.");
        }
    }
}
