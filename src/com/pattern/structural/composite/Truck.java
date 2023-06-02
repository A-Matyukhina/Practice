package com.pattern.structural.composite;

public class Truck implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " truck");
    }
}
