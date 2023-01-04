package br.com.tony.creational.factory.dto;

public class DatabaseDTO {
    private final String user;
    private final String password;

    public DatabaseDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
