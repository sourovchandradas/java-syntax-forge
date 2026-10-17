// Exercise 02: Month Day Counter with Fall-Through

public class MonthDayCalculator {
    public static void main(String[] args) {
        int month = 10; // October

        switch (month) {
            // 30 days months
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("30 days");
                break;

            // 31 days months
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("31 days");
                break;

            // February
            case 2:
                System.out.println("28 or 29 days");
                break;

            default:
                System.out.println("Invalid month");
        }
    }
}
