import java.util.HashMap;
import java.util.Map;

public class BogieCapacityManager {
    public static void main(String[] args) {

        // Create HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity pairs using put()
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacity details using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}