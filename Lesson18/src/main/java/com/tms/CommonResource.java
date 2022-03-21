package com.tms;

public class CommonResource {
    //    public AtomicInteger x = new AtomicInteger(0);
    public Integer y = 0;

    public Integer x = 0;

    private final Object lock = new Object();

    public void increment() {
        System.out.println("!!!Зашел " + Thread.currentThread().getName());
//        x = 0;
        synchronized (CommonResource.class) {
//            decrement();
            for (int i = 0; i < 5; i++) {
//                x = 1;
                System.out.println(Thread.currentThread().getName() + " " + x);
                x++;
                //атомарность
                //            Операция в общей области памяти называется атомарной,
                //            если она завершается в один шаг относительно других потоков,
                //            имеющих доступ к этой памяти. Во время выполнения такой операции над переменной,
                //            ни один поток не может наблюдать изменение наполовину завершенным.
                //            Атомарная загрузка гарантирует, что переменная будет загружена целиком в один момент времени.
                //            Неатомарные операции не дают такой гарантии.
                //            x++
                //1) считывает значение из памяти
                //2) увеличивает значение на 1
                //3) записывает значение в память
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }


//        synchronized (lock) {
//            y++;
//        }

    }

//    public synchronized int incrementX() {
////        System.out.println("incrementX " +Thread.currentThread().getName() + " " + x);
////        return x++;
//    }
//
//    public void decrement() {
//        // x.getAndSet(0);
////        System.out.println("decrement " +Thread.currentThread().getName() + " " + x);
//    }


}