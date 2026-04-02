import java.util.HashSet;

public class UniqueBogieManager {
    public static void main(String[] args) {

        // Create HashSet for storing unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (duplicates will be ignored automatically)
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // duplicate
        bogieIDs.add("B102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}