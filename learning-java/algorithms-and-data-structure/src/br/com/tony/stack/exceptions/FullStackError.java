package br.com.tony.stack.exceptions;

public class FullStackError extends RuntimeException {
    public FullStackError(String message) {
        super(message);
    }
}
