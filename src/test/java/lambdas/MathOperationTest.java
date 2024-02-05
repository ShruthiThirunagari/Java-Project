package lambdas;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationTest {

    @Test
    public void testAddition() {
        // Define the addition operation using a lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Test case: Addition of two positive numbers
        int result = addition.operate(5, 3);
        Assert.assertEquals(8, result);

        // Test case: Addition of a positive and a negative number
        result = addition.operate(10, -5);
        Assert.assertEquals(5, result);

        // Test case: Addition of two negative numbers
        result = addition.operate(-7, -3);
        Assert.assertEquals(-10, result);
    }
}

