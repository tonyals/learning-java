package br.com.tony.stack.simple;

public class SimpleStackMain {
    public static void main(String[] args) {
        StackImpl<String> stack = new StackImpl<>(new String[4]);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println("Before remove: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Top element " + stack.top());

        System.out.println("Removing...");
        System.out.println(stack.pop() + " removed");
        System.out.println(stack.pop() + " removed");
        System.out.println(stack.pop() + " removed");
        System.out.println(stack.pop() + " removed");
        System.out.println("After remove: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Top element " + stack.top()); // Throws EmptyStackException
    }
}
