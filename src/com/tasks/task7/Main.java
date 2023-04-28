package com.tasks.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human man1 = new Human("Sasha", "Matyukhina", 39, "9528 281808", "+79689181808");
        Human man2 = new Human("Andrey", "Petrov", 30, "2550 566523", "+79991234554");
        Human man4 = new Human("Anna", "Andreeva", 29, "2334 155515", "+79982883883");
        Human man3 = new Human("Sergey", "Petrov", 34, "2498 459812", "+79925542442");


        ArrayList<Human> humanList = new ArrayList<>(List.of(man1, man2, man3, man4));

        Human humanYang = null;
        int age = Integer.MAX_VALUE;
        for (Human man : humanList) {
            if (man.getAge() < age) {
                age = man.getAge();
                humanYang = humanList.get(humanList.indexOf(man));
            }
        }
        System.out.println(humanYang);
    }
}
