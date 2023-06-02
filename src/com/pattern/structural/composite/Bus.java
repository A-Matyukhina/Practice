package com.pattern.structural.composite;

public class Bus implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " bus");
    }
}
