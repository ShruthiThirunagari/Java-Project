package functionalinterfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotation() {
        assertTrue(StringRotationChecker.isRotation("abcd", "bcda"));
        assertFalse(StringRotationChecker.isRotation("hello", "world"));
    }
}

