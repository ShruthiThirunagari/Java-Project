package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StringSorterTest {
    @Test
    public void testStringSorting() {
        String[] input = {"apple", "banana", "orange", "pear", "grape"};
        String[] expected = {"pear", "apple", "grape", "orange", "banana"};

        StringSorter.sortStrings(input);

        assertArrayEquals(expected, input);
        }
}


