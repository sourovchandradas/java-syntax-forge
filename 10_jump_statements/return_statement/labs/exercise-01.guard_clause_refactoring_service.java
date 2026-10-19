// Exercise 01: Guard Clause Refactoring Service
public class UserRegistrationService {

    public static class User {
        private String username;
        private String email;
        private int age;

        public User(String username, String email, int age) {
            this.username = username;
            this.email = email;
            this.age = age;
        }

        public String getUsername() { return username; }
        public String getEmail() { return email; }
        public int getAge() { return age; }
    }

    public String registerUser(User user) {
        // Guard Clause 1: Null Check
        if (user == null) {
            return "REGISTRATION_FAILED: User object cannot be null.";
        }

        // Guard Clause 2: Username Validation
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            return "REGISTRATION_FAILED: Username is required.";
        }

        // Guard Clause 3: Email Validation
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return "REGISTRATION_FAILED: Invalid email address.";
        }

        // Guard Clause 4: Age Limit
        if (user.getAge() < 18) {
            return "REGISTRATION_FAILED: User must be at least 18 years old.";
        }

        // Success Path
        return "REGISTRATION_SUCCESS: Welcome " + user.getUsername() + "!";
    }

    public static void main(String[] args) {
        UserRegistrationService service = new UserRegistrationService();

        User invalidUser = new User("John", "john.com", 16);
        User validUser = new User("Alice", "alice@example.com", 22);

        System.out.println(service.registerUser(invalidUser));
        System.out.println(service.registerUser(validUser));
    }
}
