package com.tasks.task4;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String surname;
    private int age;
    private double money;
    private List<Human> friend = new ArrayList<>();

    public Human(String name, String surname, int age, double money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.money = money;
    }
    public void addFriend(Human human){
        List<Human> tmpHumanList = new ArrayList<>(friend);
        tmpHumanList.add(human);
        friend = tmpHumanList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Human> getFriend() {
        return friend;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", friend=" + friend +
                '}';
    }
}
