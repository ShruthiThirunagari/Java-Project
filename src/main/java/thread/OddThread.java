package thread;

public class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 60; i += 2) {
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

