// Exercise 01: Traffic Light Signal System

public class TrafficLightController {
    public static void main(String[] args) {
        String color = "YELLOW";

        if (color.equalsIgnoreCase("RED")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("YELLOW")) {
            System.out.println("Prepare to stop");
        } else if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid signal color");
        }
    }
}
