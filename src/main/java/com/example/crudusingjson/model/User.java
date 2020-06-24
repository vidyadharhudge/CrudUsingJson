package com.example.crudusingjson.model;

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String number;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String number) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
