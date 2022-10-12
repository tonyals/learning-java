package br.com.tony.multithread.course.cyclicbarrier.lesson10;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrier1 {
    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable r1 = () -> {
            System.out.println(432d * 3d);
            await(cyclicBarrier);
            System.out.println("Execucao concluida: " + Thread.currentThread().getName());
        };
        Runnable r2 = () -> {
            System.out.println(Math.pow(3d, 14d));
            await(cyclicBarrier);
            System.out.println("Execucao concluida: " + Thread.currentThread().getName());
        };
        Runnable r3 = () -> {
            System.out.println(45d * 127d / 12d);
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
