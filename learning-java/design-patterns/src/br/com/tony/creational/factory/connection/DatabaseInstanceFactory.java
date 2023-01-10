package br.com.tony.creational.factory.connection;

import br.com.tony.creational.factory.dto.DBInstanceType;

public class DatabaseInstanceFactory {
    public DatabaseInstance getDatabaseInstance(DBInstanceType dbInstanceType) {
        return switch (dbInstanceType) {
            case SQL -> new SQLInstance();
            case NOSQL -> new NoSQLInstance();
        };
    }
}
