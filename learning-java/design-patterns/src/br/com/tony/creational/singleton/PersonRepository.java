package br.com.tony.creational.singleton;

public class PersonRepository {
    private final DatabaseConnSingleton connSingleton;

    public PersonRepository() {
        this.connSingleton = DatabaseConnSingleton.getInstance();
    }

    //  Código restante omitido
}
