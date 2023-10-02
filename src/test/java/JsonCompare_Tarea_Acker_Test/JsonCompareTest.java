package JsonCompare_Tarea_Acker_Test;

import JsonCompare_Tarea_Julito.JsonCompare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonCompareTest {
    @Test
    public void testSimpleMatch() {
        String expected = "{\"Content\": \"Julio\", \"Date\": 10}";
        String actual = "{\"Content\": \"Julio\", \"Date\": 10}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIgnoringDate() {
        String expected = "{\"Content\": \"Julio\", \"Date\": \"ignore\"}";
        String actual = "{\"Content\": \"Julio\", \"Date\": 10}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertTrue(result);
    }

    @Test
    public void testMismatchOnNestedAge() {
        String expected = "{\"Content\": {\"name\": \"Julio\", \"Date\": 10}}";
        String actual = "{\"Content\": {\"name\": \"Julio\", \"Date\": 10}}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIgnoringNestedAge() {
        String expected = "{\"Content\": {\"name\": \"Julio\", \"Date\": \"ignore\"}}";
        String actual = "{\"Content\": {\"name\": \"Julio\", \"Date\": 10}}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertTrue(result);
    }

    @Test
    public void testMismatchOnArrayLength() {
        String expected = "{\"colors\": [\"red\", \"blue\", \"green\"]}";
        String actual = "{\"colors\": [\"red\", \"blue\"]}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertFalse(result);
    }

    @Test
    public void testArrayItemsMatch() {
        String expected = "{\"colors\": [\"red\", \"blue\"]}";
        String actual = "{\"colors\": [\"red\", \"blue\"]}";

        boolean result = JsonCompare.compareJson(expected, actual);
        Assertions.assertTrue(result);
    }
}
