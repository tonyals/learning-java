package br.com.tony.multithread.course.executors.lesson9;

import java.util.concurrent.*;

/*
* Executors - Scheduled
* */
public class Executors_Scheduled {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        ScheduledFuture<String> scheduledFuture = executorService.schedule(new MyRunnable(), 2, TimeUnit.SECONDS);

        System.out.println(scheduledFuture.get());
        executorService.shutdown();
    }

    /*
     * O Callable permite termos acesso a retornos de operações executadas por tarefas.
     * */
    private static class MyRunnable implements Callable<String> {
        @Override
        public String call() {
            return "Executado pela thread: " + Thread.currentThread().getName();
        }
    }
}
