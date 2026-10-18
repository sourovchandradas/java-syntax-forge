// Exercise 03: User Authentication Retry Safeguard
public class AccountLockout {
    public static void main(String[] args) {
        String[] simulatedPasswords = {"wrong1", "wrong2", "correctPass"};
        String correctPassword = "correctPass";
        int attemptCount = 0;
        int maxAttempts = 3;

        while (attemptCount < maxAttempts) {
            String currentInput = simulatedPasswords[attemptCount];
            attemptCount++;

            System.out.println("Attempt " + attemptCount + ": Entering password '" + currentInput + "'");

            if (currentInput.equals(correctPassword)) {
                System.out.println("Authentication SUCCESSFUL! Welcome to your dashboard.");
                break; // Exit login loop immediately
            }

            if (attemptCount == maxAttempts) {
                System.out.println("SECURITY ALERT: Maximum attempts reached. Account LOCKED.");
            }
        }
    }
}
