package br.com.tony.multithread.course.executors.lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/*
* Executors
* */
public class Executors_SingleThread_Callable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Future<List<Integer>> future = executorService.submit(new MyRunnable());
            //  A operação de get pressupoe que a tarefa precisa estar concluída
            System.out.println(future.get());
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
    private static class MyRunnable implements Callable<List<Integer>> {
        @Override
        public List<Integer> call() {
            return Arrays.asList(1, 2, 3, 4, 5);
        }
    }
}
