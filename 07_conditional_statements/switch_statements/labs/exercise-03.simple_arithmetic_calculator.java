// Exercise 03: Simple Arithmethic Calculator

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 2.0;
        char operator = '*'; // Try '+', '-', '*', '/'

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
