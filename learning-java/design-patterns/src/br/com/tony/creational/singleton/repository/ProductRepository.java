package br.com.tony.creational.singleton.repository;

import br.com.tony.creational.singleton.DatabaseConnSingleton;

public class ProductRepository {
    private final DatabaseConnSingleton connSingleton;

    public ProductRepository() {
        this.connSingleton = DatabaseConnSingleton.getInstance();
    }

    //  Código restante omitido
}
