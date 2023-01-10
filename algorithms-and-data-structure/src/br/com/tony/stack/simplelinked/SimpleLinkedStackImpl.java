package br.com.tony.stack.simplelinked;

import br.com.tony.stack.IStack;
import br.com.tony.stack.exceptions.EmptyStackError;

public class SimpleLinkedStackImpl<E> implements IStack<E> {
    private Node<E> top;
    private int size = 0;

    /**
     * Ao instanciar a classe o topo é nulo (sem elementos na pilha)
     * */
    public SimpleLinkedStackImpl() {
        this.top = null;
    }

    /**
     * 1. Sequência de adição de elementos:
     * 1.1 O novo elemento é o parâmetro E que pode ser String, Double, Integer ou outro objeto qualquer.
     * 1.2 Um novo elemento é adicionado instanciando-se um Node<E> que recebe 2 parâmetros, primeiro
     * um element a ser adicionado e segundo o Node que é o atual topo da pilha, caso seja a primeira adição
     * o topo é nulo, caso contrário o topo é o elemento anterior.
     *
     * 2. Sequência de leitura dos nodes:
     * 2.1 Caso tenhamos 3 nodes na pilha, chamados "Elemento 1", "Elemento 2", "Elemento 3" e eles tenham
     * sido adicionados em sequência, o "Elemento 3" tem como próximo elemento o "Elemento 2" e o "Elemento 2"
     * tem como próximo elemento o "Elemento 1".
     * */
    @Override
    public void push(E element) {
        Node<E> node = new Node<>(element, top);
        top = node;
        this.size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackError("The stack is empty");
        }
        Node<E> removed = this.top;
        this.top = top.getNext(); // Desencadeia o nó do topo
        this.size--;
        return removed.getElement();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackError("The stack is empty");
        }
        return top.getElement();
    }

    @Override
    public String toString() {
        return "SimpleLinkedStackImpl{" +
                "top=" + top +
                "size=" + size +
                '}';
    }
}
