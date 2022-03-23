import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            Philosopher philosopher = new Philosopher(semaphore, i);
            philosopher.start();
        }
    }
}
