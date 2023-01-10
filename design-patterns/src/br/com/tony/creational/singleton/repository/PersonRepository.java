package br.com.tony.creational.singleton.repository;

import br.com.tony.creational.singleton.DatabaseConnSingleton;

public class PersonRepository {
    private final DatabaseConnSingleton connSingleton;

    public PersonRepository() {
        this.connSingleton = DatabaseConnSingleton.getInstance();
    }

    //  Código restante omitido
}
