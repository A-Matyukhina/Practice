package com.tasks.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Village {
    private String name;
    private ArrayList<House> houses;

    public Village() {
    }

    public Village(String name, ArrayList<House> houses) {
        this.name = name;
        this.houses = houses;
    }

    public House getHouseByName(String name) {
        Optional<House> house = houses.stream().filter(e -> e.getNameOwner().equals(name)).findFirst();
        return house.orElse(null);
    }

    public House getHouseByAddress(String address) {
        Optional<House> house = houses.stream().filter(e -> e.getAddress().equals(address)).findFirst();
        return house.orElse(null);
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Village{" +
                "name='" + name + '\'' +
                ", houses=" + houses +
                '}';
    }
}
