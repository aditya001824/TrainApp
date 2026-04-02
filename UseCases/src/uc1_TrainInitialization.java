import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App - UC1
 * This single class handles the entire application startup and initialization.
 */
public class uc1_TrainInitialization {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Status: System Booting...");

        /* * 2. Train consist is initialized
         * Concept: List Interface & ArrayList
         * We use a List of Strings to represent the bogies for this initial phase.
         */
        List<String> trainConsist = new ArrayList<>();

        // 3. Initial bogie count is displayed
        // Concept: size() returns the number of elements currently in the list
        int initialBogieCount = trainConsist.size();

        System.out.println("Current Consist Summary:");
        System.out.println("------------------------------------");
        System.out.println("Total Bogies Attached: " + initialBogieCount);
        System.out.println("------------------------------------");

        // 4. Program continues
        if (trainConsist.isEmpty()) {
            System.out.println("Notice: The train is currently just an engine. No bogies attached.");
        }

        System.out.println("\nApplication is running. Ready for composition.");
    }
}