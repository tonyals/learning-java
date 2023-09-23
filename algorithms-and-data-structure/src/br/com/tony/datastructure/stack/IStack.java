package br.com.tony.datastructure.stack;

public interface IStack<E> {
    void push(E element);
    E pop();
    int size();
    boolean isEmpty();
    E top();
}
