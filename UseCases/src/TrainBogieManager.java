import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainBogieManager {

    /**
     * UC9: Groups bogies by their type using Stream API.
     */
    public Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getBogieType));
    }

    public static void main(String[] args) {
        TrainBogieManager manager = new TrainBogieManager();
        List<Bogie> bogieList = new ArrayList<>();

        // Now correctly matches the updated 3-argument Bogie constructor
        bogieList.add(new Bogie("B1", 72, "Sleeper"));
        bogieList.add(new Bogie("B2", 72, "Sleeper"));
        bogieList.add(new Bogie("B3", 40, "AC Chair"));

        Map<String, List<Bogie>> grouped = manager.groupBogiesByType(bogieList);
        System.out.println(grouped);
    }
}