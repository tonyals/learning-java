package br.com.tony.creational.factory;

import br.com.tony.creational.factory.connection.DatabaseInstanceFactory;
import br.com.tony.creational.factory.dto.DBInstanceType;

public class FactoryMain {
    public static void main(String[] args) {
        var factory = new DatabaseInstanceFactory();
        var sqlInstance = factory.getDatabaseInstance(DBInstanceType.SQL);
        var noSqlInstance = factory.getDatabaseInstance(DBInstanceType.NOSQL);

        System.out.println(sqlInstance.getConnection());
        System.out.println(noSqlInstance.getConnection());
    }
}
