package br.com.tony.creational.factory.connection;


public class SQLInstance implements DatabaseInstance {

    @Override
    public String getConnection() {
        return "SQL Connection created";
    }
}
