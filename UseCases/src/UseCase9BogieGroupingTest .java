import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Correct JUnit 5 imports
import java.util.List;
import java.util.Map;

class UseCase9BogieGroupingTest {
    private final TrainBogieManager service = new TrainBogieManager();

    @Test
    void testGrouping_BogiesGroupedByType() {
        // Matches the updated Bogie constructor
        List<Bogie> bogies = List.of(
                new Bogie("B1", 72, "Sleeper"),
                new Bogie("B2", 40, "AC Chair")
        );

        Map<String, List<Bogie>> grouped = service.groupBogiesByType(bogies);

        assertNotNull(grouped);
        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
    }
}