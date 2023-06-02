package com.pattern.structural.bridge;

public class Black implements Color{
    @Override
    public void fillColor() {
        System.out.println("Black");
    }
}
