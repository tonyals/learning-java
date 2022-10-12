package br.com.tony.multithread.course.runnable.lesson1;


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

/*
 * Threads e Runnable
 * */
public class Threads_1 {
    public static void main(String[] args) {
        //  Thread atual:
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

        //  Nova Thread
        Thread newThread = new Thread(new MyRunnable());
        newThread.run(); // Apenas executando o método run de MyRunnable na mesma Thread (main)
        newThread.start(); //   Executando o método run de MyRunnable em uma nova Thread
        //  newThread.start(); //   Exceção: não é possível mandar executar a mesma Thread mais de uma vez

        //  Nova Thread com Lambda
        Thread newThreadWithLambda = new Thread(() -> System.out.println("Thread usando Lambda"));
        newThreadWithLambda.start(); //   Executando o método run de MyRunnable em uma nova Thread

        //  Nova Thread com mesmo Runnable.
        Thread newThreadWithSameRunnable = new Thread(new MyRunnable());
        newThreadWithSameRunnable.start();
    }
}
