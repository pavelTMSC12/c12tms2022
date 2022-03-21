package com.tms.threads;

import com.tms.CommonResource;

public class CountThread extends Thread {
    private final CommonResource resource;
    private static String name;
    private final Object obj = new Object();

    public CountThread(String name, CommonResource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.increment();
//        method();
    }

    private synchronized void method() {

//            resource.x = 1;
//        synchronized (resource) {
//            extractedZero();
        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + resource.x);
//            resource.x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}


