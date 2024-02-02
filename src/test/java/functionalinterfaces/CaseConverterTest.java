package functionalinterfaces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CaseConverterTest {
        @Test
        public void testConvertCase() {
            String input1 = "Hello World!";
            String expectedOutput1 = "hELLO wORLD!";
            assertEquals(expectedOutput1, CaseConverter.convertCase(input1));

            String input3 = "This Is A Test";
            String expectedOutput3 = "tHIS iS a tEST";
            assertEquals(expectedOutput3, CaseConverter.convertCase(input3));

        }

}
