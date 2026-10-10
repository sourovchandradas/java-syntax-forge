// Exercise 01: Fahrenheit to Celsius Converter

public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        // Using 5.0 / 9.0 prevents integer division truncation
        double celsius = (5.0 / 9.0) * (fahrenheit - 32); 
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}
