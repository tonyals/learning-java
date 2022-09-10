package br.com.tony.multithread.course.lesson6;

public class Volatile {
    private static volatile int number = 0;
    private static volatile boolean ready = false;

    //  private static int number = 0;
    //  private static boolean ready = false;
    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }

            if (number != 42) {
                throw new IllegalStateException("Exceção lançada");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread t0 = new Thread(new MyRunnable());
            t0.start();
            Thread t1 = new Thread(new MyRunnable());
            t1.start();
            Thread t2 = new Thread(new MyRunnable());
            t2.start();

            number = 42;
            ready = true;

            while (
                    t0.getState() != Thread.State.TERMINATED
                            || t1.getState() != Thread.State.TERMINATED
                            || t2.getState() != Thread.State.TERMINATED
            ) {
                // espera
            }

            number = 0;
            ready = false;
        }
    }
}
