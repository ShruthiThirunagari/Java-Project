package lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        // Test input
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5, -6, 7, 8, -9, 10);

        // Call the method
        int result = SumOfSquares.sumOfSquares(numbers);

        // Expected output: 1^2 + 2^2 + 3^2 + 5^2 + 7^2 + 8^2 + 10^2 = 1 + 4 + 9 + 25 + 49 + 64 + 100 = 252
        assertEquals(252, result);
    }
}
