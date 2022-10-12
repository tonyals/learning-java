package br.com.tony.multithread.course.atomic.lesson5;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Atomic classes
 * */
public class AtomicClasses {

    static AtomicInteger i = new AtomicInteger(-1);

    /*
    * AtomicReference permite usar um objeto como parâmetro e ter acesso a operações dele Thread-Safe
    * sem uso de synchronized
    * */
    static AtomicReference<String> atomicReference = new AtomicReference<>("Reference");

    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": " + i.incrementAndGet());
        }
    }
}
