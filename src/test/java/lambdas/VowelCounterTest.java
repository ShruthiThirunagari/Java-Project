package lambdas;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void testVowelCounter() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String[] strings = {"hello", "world", "apple", "banana", "kiwi"};

        // Call the method
        VowelCounter.main(null);

        // Expected output
        String expectedOutput = "String: hello, Vowel Count: 2\n" +
                "String: world, Vowel Count: 1\n" +
                "String: apple, Vowel Count: 2\n" +
                "String: banana, Vowel Count: 3\n" +
                "String: kiwi, Vowel Count: 2\n";

        // Check if the printed output matches the expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset System.out
        System.setOut(System.out);
    }
}

