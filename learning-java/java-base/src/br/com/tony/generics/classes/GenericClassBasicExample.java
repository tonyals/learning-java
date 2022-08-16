package br.com.tony.generics.classes;

// T eh o tipo de elemento que sera usado na classe (String, Client, Product)
public class GenericClassBasicExample<T> {
    //  O tipo T recebido sera usado para definir o tipo data.
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
