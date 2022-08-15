package br.com.tony.stack.exceptions;

public class EmptyStackError extends RuntimeException {
    public EmptyStackError(String message) {
        super(message);
    }
}
