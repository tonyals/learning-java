package br.com.tony.multithread.runnable;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
