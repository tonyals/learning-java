package br.com.tony.creational.factory.connection;

import br.com.tony.creational.factory.dto.DatabaseDTO;

public class SQLInstance implements DatabaseInstance {

    private final DatabaseDTO databaseDTO;

    public SQLInstance(DatabaseDTO databaseDTO) {
        this.databaseDTO = databaseDTO;
    }

    @Override
    public String getConnection() {
        return "SQL Connection created";
    }
}
