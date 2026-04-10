import java.util.ArrayList;
import java.util.List;

// REMOVED 'public' to allow this class to exist inside BogieSorter.java
class Bogie {
    String name;
    int capacity;
    String type; // ADDED to support the 3-argument constructor

    // Standardized to 3 arguments to match TrainBogieManager and Tests
    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    // FIXED: Added return statement to resolve "Missing return statement" error
    public String getBogieType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (Type: " + type + ", Capacity: " + capacity + ")";
    }
}

public class BogieSorter {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        // Updated to match the new 3-argument constructor
        bogies.add(new Bogie("B1", 72, "Sleeper"));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);
    }
}