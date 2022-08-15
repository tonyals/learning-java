package br.com.tony.generics;


public class TheProblemMain {
    public static void main(String[] args) {
        //  Object eh a superclasse de todas as classes do Java, portanto, aceita qualquer
        //  atribuicao.
        Object obj = "Hello World";

        //  O problema dessa generalizacao usando Object eh que posso reatribuir tipos
        //  diferentes. Por exemplo, obj recebendo um Integer 1
        obj = Integer.valueOf(1);

        //  Esse codigo compilara e seu bytecode sera gerado, entretando
        //  a operacao de casting retornara uma exception em tempo de execucao
        //  pois nao eh possivel fazer cast de Integer para String
        String str = (String) obj;
        System.out.println(str);

        //  Arrays de Object
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = "World";
        objects[2] = 10;

        String strArray;

        //  Uma ClassCastException sera lancada ao tentar fazer casting da posicao 2 do array
        for (int i = 0; i < objects.length; i++) {
            strArray = (String) objects[i];
            System.out.println(strArray);
        }
    }
}
