package br.com.tony.multithread.course.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Synchronize Collections
 * */
public class Synchronized_Collections {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        /*
        * Usando o synchronizedList conseguimos tornar uma lista Thread-Safe.
        * Ainda assim o paralelismo foi prejudicado, portanto, nao é uma boa alternativa
        * */
        list = Collections.synchronizedList(list);

        MyRunnable runnable = new MyRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(list);
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            list.add("Add String");
        }
    }
}
