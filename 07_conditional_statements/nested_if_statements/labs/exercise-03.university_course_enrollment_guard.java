// Exercise 03: University Course Enrollment Guard
public class CourseEnrollment {
    public static void main(String[] args) {
        boolean hasPrerequisite = true;
        double gpa = 3.4;
        int seatsAvailable = 5;

        // Level 1 Check: Prerequisite completion
        if (hasPrerequisite) {
            // Level 2 Check: GPA threshold
            if (gpa >= 3.0) {
                // Level 3 Check: Seat availability
                if (seatsAvailable > 0) {
                    System.out.println("Enrollment Successful!");
                } else {
                    System.out.println("Enrollment Failed: Course section is full.");
                }
            } else {
                System.out.println("Enrollment Failed: Minimum GPA requirement (3.0) not met.");
            }
        } else {
            System.out.println("Enrollment Failed: Prerequisite course not completed.");
        }
    }
}
