package p1;

class Task implements Runnable {
    // Try running with and without 'volatile' here
    private volatile boolean state = true;
    private int i = 0;

    public void stop() {
        state = false;
    }

    @Override
    public void run() {
        while (state) {
            i++;
        }
        System.out.println(i + "> Stopped on: " + System.nanoTime());
    }
}