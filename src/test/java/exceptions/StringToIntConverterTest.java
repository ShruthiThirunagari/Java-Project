package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringToIntConverterTest {

    @Test
    void testConvertStringToInt() {
        assertEquals(23, StringToIntConverter.convertStringToInt("23"));
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("45.67"));
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("test"));
        assertThrows(NumberFormatException.class, () -> StringToIntConverter.convertStringToInt("123f"));
    }
}


