package br.com.tony.creational.factory.dbfactory.connection;

import br.com.tony.creational.factory.dbfactory.dto.DBInstanceType;

public class DatabaseInstanceFactory {
    public DatabaseInstance getDatabaseInstance(DBInstanceType dbInstanceType) {
        return switch (dbInstanceType) {
            case SQL -> new SQLInstance();
            case NOSQL -> new NoSQLInstance();
        };
    }
}
