package br.com.tony.creational.factory.connection;


public class NoSQLInstance implements DatabaseInstance {

    @Override
    public String getConnection() {
        return "NoSQL Connection created";
    }
}
