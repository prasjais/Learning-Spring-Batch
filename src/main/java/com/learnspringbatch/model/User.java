package com.learnspringbatch.model;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private int salary;

    public User()
    {

    }

    public User(int userId, String firstName, String lastName, int salary) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
