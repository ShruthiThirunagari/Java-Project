package thread;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ThreadTest {

    @Test
    public void testThreads() {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();

        // Wait for both threads to complete execution
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if both threads are not alive anymore
        assertFalse(evenThread.isAlive());
        assertFalse(oddThread.isAlive());
    }
}
