package br.com.tony.multithread.course.lesson7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
* Executors
* */
public class Executors_SingleThread_Runnable {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            //  Um executor pode executar várias tarefas (Runnable), basta usar o .execute
            executorService.execute(new MyRunnable());
            executorService.execute(new MyRunnable());
            executorService.execute(new MyRunnable());

            Future<?> submit = executorService.submit(new MyRunnable());
            System.out.println(submit.isDone());

            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw e;
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Executors single thread: " + Thread.currentThread().getName());
        }
    }
}
