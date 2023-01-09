package br.com.tony.creational.singleton;

import java.util.Objects;

public class DatabaseConnSingleton {

    private static DatabaseConnSingleton instance;

    private DatabaseConnSingleton() {}

    /**
     * Implementação abaixo somente para cenários não multithread.
     * Em cenários multithread utilizar a implementação singleton thread-safe
     * */
    public static DatabaseConnSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new DatabaseConnSingleton();
        }
        return instance;
    }
}
