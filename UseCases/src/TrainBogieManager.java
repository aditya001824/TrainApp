import java.util.ArrayList;

public class TrainBogieManager {
    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies (Create operation)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion (Read operation)
        System.out.println("Bogies after addition:");
        System.out.println(bogies);

        // Remove a bogie (Delete operation)
        bogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        // Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the list.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state of the list
        System.out.println("\nFinal list of bogies:");
        System.out.println(bogies);
    }
}