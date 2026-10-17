// Exercise 01: Traffic Light State Machine
// Step 1: Create Enum
enum Signal {
    RED, YELLOW, GREEN
}

// Step 2: Controller Class
public class TrafficLightController {
    public static void main(String[] args) {
        Signal currentSignal = Signal.GREEN; // Here, you change the signal

        switch (currentSignal) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}
