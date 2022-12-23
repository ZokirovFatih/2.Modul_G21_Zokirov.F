package model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String userName;
    private String password;

    public User() {
        this.id=UUID.randomUUID();
    }

    public User(String name, String userName, String password) {
        this();
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
