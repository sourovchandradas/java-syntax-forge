// Exercise 01: State Inversion and Counter Logic
public class ButtonToggle {
    public static void main(String[] args) {
        boolean isOn = false;
        int clickCount = 0;

        // First click
        isOn = !isOn;
        clickCount++;
        System.out.println("Button On: " + isOn + ", Clicks: " + clickCount); // true, 1

        // Second click
        isOn = !isOn;
        clickCount++;
        System.out.println("Button On: " + isOn + ", Clicks: " + clickCount); // false, 2
    }
}
