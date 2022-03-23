import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    Semaphore semaphore;
    int num = 0;
    int id;

    Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (num < 3) {
            semaphore.acquire();
            System.out.println("филосов " + id + " садится за стол");
            sleep(500);
            num++;
            System.out.println("филосов " + id + " выходит из за стола");
            semaphore.release();
            sleep(500);
        }

    }
}
