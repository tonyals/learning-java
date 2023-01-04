package br.com.tony.creational.factory.connection;

import br.com.tony.creational.factory.dto.DBInstanceType;
import br.com.tony.creational.factory.dto.DatabaseDTO;

public class DatabaseInstanceFactory {
    public DatabaseInstance getDatabaseInstance(DBInstanceType dbInstanceType, DatabaseDTO databaseDTO) {
        return switch (dbInstanceType.name()) {
            case "SQL" -> new SQLInstance(databaseDTO);
            case "NOSQL" -> new NoSQLInstance(databaseDTO);
            default -> throw new IllegalArgumentException();
        };
    }
}
