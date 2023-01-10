package br.com.tony.multithread.course.cyclicbarrier.lesson10;

import java.util.concurrent.*;

public class CyclicBarrier2 {

    private static final BlockingQueue<Double> results = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        Runnable finish = () -> {
            System.out.println("Resultado: " + results.stream().reduce(0d, Double::sum));
        };

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, finish);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable r1 = () -> {
            results.add(432d * 3d);
            await(cyclicBarrier);
            System.out.println("Execucao concluida: " + Thread.currentThread().getName());
        };
        Runnable r2 = () -> {
            results.add(Math.pow(3d, 14d));
            await(cyclicBarrier);
            System.out.println("Execucao concluida: " + Thread.currentThread().getName());
        };
        Runnable r3 = () -> {
            results.add(45d * 127d / 12d);
            await(cyclicBarrier);
            System.out.println("Execucao concluida: " + Thread.currentThread().getName());
        };

        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);
        executorService.shutdown();
    }

    private static void await(CyclicBarrier cyclicBarrier) {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
