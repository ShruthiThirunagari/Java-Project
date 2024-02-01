package functionalinterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapValuesTest {

    @Test
    public void testSwap() {
        int a = 5;
        int b = 10;

        SwapValues.swap(a, b);

        assertEquals(10, a);
        assertEquals(5, b);
    }
}
