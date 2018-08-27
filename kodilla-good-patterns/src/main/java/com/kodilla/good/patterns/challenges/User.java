package com.kodilla.good.patterns.challenges;

public class User {

    String userName;
    String firstName;
    String lastName;
    String address;
    String mail;
    String accountNumber;

    public User(String userName, String firstName, String lastName, String address, String mail, String accountNumber) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mail = mail;
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
