package com.optional;
   /*
    Создайте класс PersonService с методом getPerson(String name),
который принимает имя человека и возвращает экземпляр класса Person.
Если человек с таким именем не найден, метод должен возвращать null.

Измените метод getPerson(String name) так, чтобы он возвращал объект
Optional<Person> вместо Person. В случае, если человек не найден, метод должен возвращать Optional.empty().

Добавьте метод getAge(String name) в класс PersonService, который
принимает имя человека и возвращает его возраст, используя метод getPerson(String name).
     */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {
    private List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = personList;
    }

    public PersonService() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Person getPerson(String name){
        return personList.stream().filter(e -> e.getName().equals(name)).findAny().orElse(null);
    }
    public Optional<Person> getPerson2(String name){
        return personList.stream().filter(e -> e.getName().equals(name)).findAny();
    }
//    public Optional<Person> getPerson(String name) {
//        Optional<Person> result = personList.stream().filter(e -> e.getName().equals(name)).findAny();
//        if(result.isPresent()){
//            return result;
//        } else {
//            return Optional.empty();
//        }
//    }
//    или
//    public Optional<Person> getPerson(String name) {
//        return personList.stream().filter(e -> e.getName().equals(name))
//        .findAny().filter(Optional::isPresent).orElse(Optional.empty());
//    }

//    public int getAge(String name) {
//        Optional<Person> person = getPerson(name);
//        return person.map(Person::getAge).orElse(-1);
//    }
//public int getAge(String name) {
//    Optional<Person> person = getPerson(name);
//    if (person.isPresent()) {
//        return person.get().getAge();
//    } else {
//        // обработка отсутствия человека с таким именем
//        return -1;
//    }
//}
    public int getAge(String name){
        Optional<Person> person = getPerson2(name);
        return person.map(Person::getAge).orElse(-1);
    }
}
