package com.tasks.task4;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Andrey", "Sidorov", 32, 1_000_000.00);

        human.addFriend(new Human("Dmitriy", "Donskoy", 33, 2_122_120.20));
        human.addFriend(new Human("Anatoly", "Nevzorov", 31, 999_999.10));
        human.addFriend(new Human("Violetta", "Afanasieva", 29, 1_700_134.00));
        human.addFriend(new Human("Anna", "Fedorova", 35, 998_912.30));


        List<Human> tmpList = human.getFriend();
        System.out.println(tmpList);
        Human human1 = tmpList.stream().max(Comparator.comparingDouble(Human::getMoney)).get();
        tmpList.remove(human1);
        System.out.println(tmpList);
        Human human2 = tmpList.stream().min(Comparator.comparingInt(Human::getAge)).get();
        human2.setAge(human2.getAge() + 1);
        System.out.println(tmpList);
    }
}
