package com.tasks.task7;

public class Human {
    private String name;
    private String lastName;
    private int age;
    private String passportNumber;
    private String telephoneNumber;

    public Human(String name, String lastName, int age, String passportNumber, String telephoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.passportNumber = passportNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", passportNumber='" + passportNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
