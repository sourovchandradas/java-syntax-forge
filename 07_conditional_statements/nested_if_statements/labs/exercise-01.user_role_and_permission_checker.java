// Exercise 01: User Role and Permission Checker
public class RolePermissionCheck {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        String userRole = "ADMIN";

        // Outer check: Login status
        if (isLoggedIn) {
            // Inner check: User role authorization
            if ("ADMIN".equalsIgnoreCase(userRole)) {
                System.out.println("Access Granted: Admin Control Center.");
            } else {
                System.out.println("Access Granted: Standard User Dashboard.");
            }
        } else {
            System.out.println("Access Denied: Please log in first.");
        }
    }
}
