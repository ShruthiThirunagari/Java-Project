package thread;
public class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("EvenThread: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
