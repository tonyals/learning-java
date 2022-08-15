package br.com.tony.generics;

public class TheSolutionMain<T> {

    T[] objects = (T[]) new Object[3];

    public static void main(String[] args) {
        //  Arrays de Object
        TheSolutionMain<String> strArray = new TheSolutionMain<>();

        strArray.objects[0] = "Hello";
        strArray.objects[1] = "World";
        //  Um erro de compilacao eh exibido
        //  strArray.objects[2] = 10;

    }
}
