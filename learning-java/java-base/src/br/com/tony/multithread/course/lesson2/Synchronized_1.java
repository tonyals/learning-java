package br.com.tony.multithread.course.lesson2;

/*
 * Synchronized
 * */
public class Synchronized_1 {
    static int i = -1;

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    /*
    * Para utilizar o synchronized em blocos static podemos colocar como lock a propria classe,
    * só que ao colocar lock static na classe somente uma Thread por vez pode executar a nível de
    * JVM e não de instancia quando se trata de metodos nao static
    * */
    public static void print() {
        synchronized (Synchronized_1.class) {
            i++;
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static class MyRunnable implements Runnable {

        /*
        * Usando o synchronized somente uma Thread pode executar o método run por vez. Dessa forma
        * perde-se o paralelismo pois cada Thread deve finalizar a execução do método run para que
        * outra Thread tenha acesso. É como se as Threads fossem "enfileiradas" no momento de
        * executar o método run, o que é uma grande DESVANTAGEM pois não ha mais paralelismo
        * */
        @Override
        public synchronized void run() {
            i++;
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

        /*
        * Podemos tbem usar synchronized em blocos de código dentro do método:
        * @Override
            public void run() {
                synchronized (this) {
                    i++;
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        *
        * */
    }
}
