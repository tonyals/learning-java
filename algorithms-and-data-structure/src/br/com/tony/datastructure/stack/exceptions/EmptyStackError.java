package br.com.tony.datastructure.stack.exceptions;

public class EmptyStackError extends RuntimeException {
    public EmptyStackError(String message) {
        super(message);
    }
}
