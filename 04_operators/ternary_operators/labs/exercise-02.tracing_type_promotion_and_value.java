// Exercise 02: Trace Type Promotion and Value
public class Exercise2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.0;
        boolean check = false;

        // 'int' promotes to 'double'; 'var' infers type 'double' at compile time
        var val = check ? a : b; 

        System.out.println(val); // Output: 20.0 (returns 'b' as 'check' is false)
    }
}
