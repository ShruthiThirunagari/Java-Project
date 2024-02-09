package thread;

import org.junit.Test;

public class DeadLockExampleTest {

    @Test(timeout = 2000) // Set timeout to fail test if it takes too long
    public void testDeadlock() {
        DeadLockExample deadlockExample = new DeadLockExample();
        deadlockExample.deadlock(); // Invoke the method that causes deadlock
    }
}