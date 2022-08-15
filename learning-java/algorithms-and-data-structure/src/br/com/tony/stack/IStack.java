package br.com.tony.stack;

public interface IStack<E> {
    void push(E element);
    E pop();
    int size();
    boolean isEmpty();
    E top();
}
