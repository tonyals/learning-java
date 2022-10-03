package br.com.tony.creational.singleton;

import java.util.Objects;

/**
 * Garante que somente uma instância da classe estará disponível para uso em todo o sistema
 * como se fosse uma variável global.
 * Útil para acesso a banco de dados, interface gráfica etc
 * */
class SingletonImpl {
    private static SingletonImpl instance;
    private SingletonImpl(){}

    public static SingletonImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SingletonImpl();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        var singletonOne = SingletonImpl.getInstance();
        var singletonTwo = SingletonImpl.getInstance();
        var singletonThree = SingletonImpl.getInstance();

        System.out.println(singletonOne.equals(singletonTwo));
        System.out.println(singletonTwo.equals(singletonThree));
    }
}
