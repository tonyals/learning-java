package br.com.tony.stack.simple;


import br.com.tony.stack.IStack;
import br.com.tony.stack.exceptions.EmptyStackError;
import br.com.tony.stack.exceptions.FullStackError;

import java.util.Arrays;

public class StackImpl<E> implements IStack<E> {

    private final E[] stack;
    private int count = 0;

    public StackImpl(E[] stack) {
        this.stack = stack;
    }

    @Override
    public void push(E element) {
        if (this.count == this.stack.length) {
            throw new FullStackError("The stack is full");
        }
        this.stack[count] = element;
        this.count++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackError("The stack is empty");
        }
        int indexToRemove = this.count - 1;

        E elementRemoved = this.stack[indexToRemove];
        this.stack[indexToRemove] = null;
        this.count--;
        return elementRemoved;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count <= 0;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackError("The stack is empty");
        }
        return this.stack[this.count - 1];
    }

    @Override
    public String toString() {
        return "StackImpl{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
