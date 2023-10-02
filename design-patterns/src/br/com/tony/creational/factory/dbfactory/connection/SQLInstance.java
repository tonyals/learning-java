package br.com.tony.creational.factory.dbfactory.connection;


public class SQLInstance implements DatabaseInstance {

    @Override
    public String getConnection() {
        return "SQL Connection created";
    }
}
