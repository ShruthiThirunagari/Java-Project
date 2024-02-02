package functionalinterfaces;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testCountUniqueWords() {
        String input1 = "hello world hello world";
        int expectedOutput1 = 2;
        assertEquals(expectedOutput1, UniqueWordCounter.countUniqueWords(input1));

        String input3 = "Java Java is the best best programming language";
        int expectedOutput3 = 6;
        assertEquals(expectedOutput3, UniqueWordCounter.countUniqueWords(input3));

    }
}


