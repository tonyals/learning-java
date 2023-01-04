package br.com.tony.creational.factory;

import br.com.tony.creational.factory.connection.DatabaseInstanceFactory;
import br.com.tony.creational.factory.dto.DBInstanceType;
import br.com.tony.creational.factory.dto.DatabaseDTO;

public class FactoryMain {
    public static void main(String[] args) {
        DatabaseDTO sqlDto = new DatabaseDTO("sqluser", "sqlpass");
        DatabaseDTO noSqlDto = new DatabaseDTO("nosqluser", "nosqlpass");

        var factory = new DatabaseInstanceFactory();
        var sqlInstance = factory.getDatabaseInstance(DBInstanceType.SQL, sqlDto);
        var noSqlInstance = factory.getDatabaseInstance(DBInstanceType.NOSQL, noSqlDto);

        System.out.println(sqlInstance.getConnection());
        System.out.println(noSqlInstance.getConnection());
    }
}
