package com.pattern.damaging.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().withName("Andrey").withAge(20).withHeight(180).build();
    }
}
