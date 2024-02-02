package functionalinterfaces;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ArrayListReverserTest {
    @Test
        public void testReverseArrayList() {
            List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            List<Integer> expectedOutput1 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
            assertEquals(expectedOutput1, ArrayListReverser.reverseArrayList(input1));

            List<String> input2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
            List<String> expectedOutput2 = new ArrayList<>(Arrays.asList("date", "cherry", "banana", "apple"));
            assertEquals(expectedOutput2, ArrayListReverser.reverseArrayList(input2));

            List<Character> input3 = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
            List<Character> expectedOutput3 = new ArrayList<>(Arrays.asList('e', 'd', 'c', 'b', 'a'));
            assertEquals(expectedOutput3, ArrayListReverser.reverseArrayList(input3));

            List<Double> input4 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
            List<Double> expectedOutput4 = new ArrayList<>(Arrays.asList(5.5, 4.4, 3.3, 2.2, 1.1));
            assertEquals(expectedOutput4, ArrayListReverser.reverseArrayList(input4));

            List<Integer> input5 = new ArrayList<>();
            List<Integer> expectedOutput5 = new ArrayList<>();
            assertEquals(expectedOutput5, ArrayListReverser.reverseArrayList(input5));
        }
}
