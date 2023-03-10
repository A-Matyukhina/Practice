package com.optional;
/*
Создайте класс Person с полями name (String) и age (int).

Создайте класс PersonService с методом getPerson(String name),
который принимает имя человека и возвращает экземпляр класса Person.
Если человек с таким именем не найден, метод должен возвращать null.

Измените метод getPerson(String name) так, чтобы он возвращал объект
Optional<Person> вместо Person. В случае, если человек не найден, метод должен возвращать Optional.empty().

Добавьте метод getAge(String name) в класс PersonService, который
принимает имя человека и возвращает его возраст, используя метод getPerson(String name). Если человек не найден
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
