package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageOfSquaresOfOddNumbersTest {

    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expectedAverage = (1 * 1 + 3 * 3 + 5 * 5) / 3.0;

        double result = AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(numbers);

        assertEquals(expectedAverage, result, 0.001);
    }
}
