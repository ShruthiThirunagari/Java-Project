package functionalinterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySumTest {

    @Test
    public void testCalculateArraySum() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 1 + 2 + 3 + 4 + 5;
        assertEquals(expectedSum, ArraySum.calculateArraySum(array));
    }

    @Test
    public void testCalculateArraySumWithEmptyArray() {
        int[] array = {};
        assertEquals(0, ArraySum.calculateArraySum(array));
    }

    @Test
    public void testCalculateArraySumWithSingleElement() {
        int[] array = {10};
        assertEquals(10, ArraySum.calculateArraySum(array));
    }

    @Test
    public void testCalculateArraySumWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int expectedSum = -1 - 2 - 3 - 4 - 5;
        assertEquals(expectedSum, ArraySum.calculateArraySum(array));
    }
}
