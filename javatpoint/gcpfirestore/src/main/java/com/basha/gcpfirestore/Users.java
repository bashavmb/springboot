package com.basha.gcpfirestore;

import org.springframework.beans.factory.annotation.Autowired;

public class Users {

    private String firstName;
    private String lastName;
    private String middleName;
    private String dob;


    @Autowired
    public  Users(String firstName, String lastName, String middleName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dob = dob;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
