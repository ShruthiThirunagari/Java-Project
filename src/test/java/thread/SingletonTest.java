package thread;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same object
        assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonFunctionality() {
        Singleton instance = Singleton.getInstance();

        // Test any functionality provided by the Singleton class
        assertNotNull(instance);
        instance.showMessage();
    }
}

