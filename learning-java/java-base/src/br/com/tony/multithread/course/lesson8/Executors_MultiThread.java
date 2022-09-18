package br.com.tony.multithread.course.lesson8;

import java.util.concurrent.*;

/*
* Executors
* */
public class Executors_MultiThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = null;
        try {
            //  O fixed thread pool limita o número de threads que o executor pode utilizar
            //  executorService = Executors.newFixedThreadPool(4);

            //  O cached thread pool deixa o executor criar as threads que precisar
            //  e tbem consegue reaproveitar threads criadas e que ja terminaram suas
            //  tarefas para executar novas tarefas.
            //  Cuidado: cached thread pool nao tem limite de criacao de threads, deve-se ter cuidado
            executorService = Executors.newCachedThreadPool();
            Future<String> f1 = executorService.submit(new MyRunnable());
            Future<String> f2 = executorService.submit(new MyRunnable());
            Future<String> f3 = executorService.submit(new MyRunnable());
            Future<String> f4 = executorService.submit(new MyRunnable());
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            executorService.shutdown();
        } catch (Exception e) {
            throw e;
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

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
