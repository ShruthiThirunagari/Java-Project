package functionalinterfaces;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RepeatedCharactersTest {

    @Test
    public void testPrintRepeatedCharacters() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input string
        String str = "hello world";

        // Call the method
        RepeatedCharacters.printRepeatedCharacters(str);

        // Restore System.out
        System.setOut(System.out);

        // Verify output
        String expectedOutput = "Repeated characters in the string:\n" +
                "l: 3 times\n" +
                "o: 2 times\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}