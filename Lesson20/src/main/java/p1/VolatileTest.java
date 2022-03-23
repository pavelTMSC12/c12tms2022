package p1;

public class VolatileTest {
    public static void main(String[] a) throws Exception {
        Task task = new Task();
        new Thread(new Task()).start();
//        new Thread(new Task()).start();
//        new Thread(new Task()).start();

        Thread.sleep(500);
        long stoppedOn = System.nanoTime();

        task.stop(); // -----> do this to stop the thread

        System.out.println("Stopping main thread: " + stoppedOn);
    }
}
