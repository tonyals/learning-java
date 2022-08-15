package br.com.tony.multithread;

import br.com.tony.multithread.runnable.ThreadRunnable;

public class Main {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

        //  Criar uma nova Thread
        Thread t1 = new Thread(new ThreadRunnable());
        //  t1.run(); apenas executando na mesma thread
        t1.start(); //  executando em uma nova thread
    }
}
