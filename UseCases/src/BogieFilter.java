import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Renamed to 'BogieReport' to stay unique and avoid duplication errors
class BogieReport {
    String name;
    int capacity;
    String type;

    BogieReport(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (Type: " + type + ", Capacity: " + capacity + ")";
    }
}

public class BogieFilter {
    public static void main(String[] args) {
        // Use the new class name 'BogieReport' here
        List<BogieReport> bogies = new ArrayList<>();

        bogies.add(new BogieReport("B1", 72, "Sleeper"));
        bogies.add(new BogieReport("B2", 72, "Sleeper"));
        bogies.add(new BogieReport("B3", 40, "AC Chair"));
        bogies.add(new BogieReport("B4", 24, "First Class"));

        System.out.println("--- All Bogies List ---");
        bogies.forEach(System.out::println);

        // UC9 Logic: Grouping using the local BogieReport class
        Map<String, List<BogieReport>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(BogieReport::getType));

        System.out.println("\n--- UC9: Grouped Bogies ---");
        grouped.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}