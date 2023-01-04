package br.com.tony.creational.factory.connection;

import br.com.tony.creational.factory.dto.DatabaseDTO;

public class NoSQLInstance implements DatabaseInstance {

    private final DatabaseDTO databaseDTO;

    public NoSQLInstance(DatabaseDTO databaseDTO) {
        this.databaseDTO = databaseDTO;
    }

    @Override
    public String getConnection() {
        return "NoSQL Connection created";
    }
}
