package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class CapitalizeandSortTest {

    @Test
    public void testCapitalizeandSort() {
        String[] input = {"apple", "banana", "orange", "kiwi"};
        String[] expectedOutput = {"Apple", "Banana", "Kiwi", "Orange"};

        String[] result = CapitalizeandSort.capitalizeandSort(input);

        assertArrayEquals(expectedOutput, result);
    }
}
