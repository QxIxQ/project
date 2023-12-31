package edu.java.learningproject.domain;

import java.time.LocalDate;

public abstract class Person
{
    private String surName;
    private String givenName;
    private String  patronymic;
    private LocalDate dataOfBirth;
    private String Address;

    public Person(){
    }

    public Person(String surName, String givenName, String patronymic, LocalDate dataOfBirth) {  //create construct with parameters
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dataOfBirth = dataOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}