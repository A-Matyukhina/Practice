package com.pattern.damaging.builder;

public class Person {
    private String name;
    private int age;
    private int height;
//Создаем статический класс Билдер, чтоб сократить написание при создании объекта с большим количеством полей
    public static class Builder{
        private Person person;
        public Builder() {
            person = new Person();
        }
        public Builder withName(String name){
            person.name = name;
            return this;
        }
        public Builder withAge(int age){
            person.age = age;
            return this;
        }
        public Builder withHeight(int height){
            person.height = height;
            return this;
        }
        public Person build(){
            return person;
        }
    }







    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
