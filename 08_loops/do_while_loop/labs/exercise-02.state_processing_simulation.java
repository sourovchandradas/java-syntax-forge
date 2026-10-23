// Exercise 02: State Processing Simulation
public class StateSteps {
    public static void main(String[] args) {

        // Initial state value
        int state = 10;

        do {
            // Display current state
            System.out.println("State = " + state);

            // Subtract 3 from state
            state = state - 3;

        } while (state > 0);

        // Display final state (0 or negative)
        System.out.println("State = " + state);
    }
}
