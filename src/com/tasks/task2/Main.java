package com.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("Гаврилов", "Ленина, 20");
        House house2 = new House("Иванов", "Ленина, 6");
        House house3 = new House("Петров", "Кирова, 2");
        House house4 = new House("Мартынова", "Подгорная, 1");

        Village village = new Village();
        village.setHouses(new ArrayList<>(List.of(house1,house2,house3,house4)));
        village.addHouse(new House("Алехин", "Севастопольская, 3"));
        System.out.println(village.getHouses());
        System.out.println(village.getHouseByName("Иванов"));
        System.out.println(village.getHouseByAddress("Ленина, 20"));
        System.out.println(village.getHouseByAddress("Московская, 20"));
    }
}
