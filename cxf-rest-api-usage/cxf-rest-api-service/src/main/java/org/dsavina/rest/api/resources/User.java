package org.dsavina.rest.api.resources;

public class User {

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;

    public User() {
    };

    public User(int id, String login, String password, String firstName, String lastName) {
        this.setId(id);
        this.setLogin(login);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
