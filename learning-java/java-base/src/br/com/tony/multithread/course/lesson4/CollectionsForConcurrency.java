package br.com.tony.multithread.course.lesson4;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Collections for concurrency
 * */
public class CollectionsForConcurrency {

    /*
    * CopyOnWriteArrayList<>() é uma alternativa Thread-Safe ao ArrayList. O problema é que a
    * cada modificação uma nova cópia da lista é usada, por isso o nome CopyOnWriteArrayList.
    * Não devemos utiliza-la caso haja várias operações de alteração da lista (add, remove).
    * Considerar o uso caso hajam somente operações de leitura, mas há opções melhores.
    * */
    static List<String> list = new CopyOnWriteArrayList<>();

    /*
    * LinkedBlockingQueue é uma alternativa Thread-Safe a fila. A implementação é semelhante
    * a uma FIFO. É uma implementacao interessante quando temos uma fila onde elementos sao adicionados
    * para depois serem removidos e seguida por um consumidor
    * */
    static Queue<String> queue = new LinkedBlockingQueue<>();

    /*
    * ConcurrentHashMap é a alternativa Thread-Safe ao HashMap
    * Desvantagem: assim como toda classe Thread-Safe, em algum momento haverá limitação de acesso
    * ao Map.
    * Vantagem: a parte que necessita ser synchronized já está implementada e testada, evitando o
    * dev ter que fazê-la na mão e com grandes chances de side-effects.
    * */
    static Map<String, Integer> map = new ConcurrentHashMap<>();



    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        //  Aguarda 500ms ate executar o sout para esperar as demais threads finalizarem:
        Thread.sleep(500);

        System.out.println(list);
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            list.add("Add String");
            System.out.println("The Thread: " + Thread.currentThread().getName() + " add in the list");
        }
    }
}
