package br.com.tony.creational.singleton;

public class ProductRepository {
    private final DatabaseConnSingleton connSingleton;

    public ProductRepository() {
        this.connSingleton = DatabaseConnSingleton.getInstance();
    }

    //  Código restante omitido
}
