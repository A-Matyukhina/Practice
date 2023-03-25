package com.optional;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Petya", 12);
        Person p2 = new Person("Masha", 14);
        Person p3 = new Person("Ivan", 16);
        Person p4 = new Person("Dasha", 11);
        Person p5 = new Person("Anton", 9);

        PersonService personService = new PersonService();
        personService.getPersonList().add(p1);//access through field to object is illegal, must be done through method
        personService.getPersonList().add(p2);
        personService.getPersonList().add(p3);
        personService.getPersonList().add(p4);
        personService.getPersonList().add(p5);

        System.out.println(personService.getPerson("Anton"));
        System.out.println("------------------------------");
        System.out.println(personService.getPerson("Andrey"));
        System.out.println("------------------------------");
        System.out.println(personService.getPerson2("Masha"));
        System.out.println("------------------------------");
        System.out.println(personService.getPerson2("Andrey"));
        System.out.println("------------------------------");
        System.out.println(personService.getAge("Dasha"));
    }
}
