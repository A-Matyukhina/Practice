package com.tasks.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Анна");
        person1.setLastName("Михайлова");
        person1.setAge(12);
        Person person2 = new Person("Андрей", "Петров", 23);

        List<Person> personList = new ArrayList<>();
        personList.add(0, person1);
        personList.add(1, person2);
        personList.add(2, new Person("Евгений", "Ковалев", 35));
        personList.add(3, new Person("Зинаида", "Ковальчук", 27));

        Optional<Person> result1 = personList.stream().max(Comparator.comparingInt(Person::getAge));
        System.out.println(result1.get().getLastName());
        System.out.println("-------------------------------");
        Optional<Person> result2 = personList.stream().min(Comparator.comparingInt(Person::getAge));
        System.out.println(result2.get().getLastName());
        System.out.println("-------------------------------");
        List<Person> result = personList.stream().filter(person -> person.getLastName().indexOf('К') == 0).toList();
        result.forEach(System.out::println);
        System.out.println("-------------------------------");
    }
}
