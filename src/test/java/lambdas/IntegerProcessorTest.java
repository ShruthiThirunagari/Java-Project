package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerProcessorTest {

    @Test
    public void testFilterAndDoubleEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = IntegerProcessor.filterAndDoubleEvenNumbers(numbers);

        List<Integer> expected = Arrays.asList(4, 8, 12, 16, 20);

        Assert.assertEquals(expected, result);
    }
}

