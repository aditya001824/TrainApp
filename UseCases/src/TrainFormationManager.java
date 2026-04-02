import java.util.LinkedHashSet;

public class TrainFormationManager {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order will be preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (will be ignored)

        // Display final train formation
        System.out.println("Final Train Formation (No duplicates, Order preserved):");
        System.out.println(trainFormation);
    }
}