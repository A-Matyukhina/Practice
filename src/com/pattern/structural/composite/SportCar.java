package com.pattern.structural.composite;

public class SportCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " sportCar");
    }
}
