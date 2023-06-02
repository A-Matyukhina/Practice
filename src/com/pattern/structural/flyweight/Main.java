package com.pattern.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.getCharacter(1).printCharacter();
        factory.getCharacter(2).printCharacter();
        factory.getCharacter(3).printCharacter();
        factory.getCharacter(1).printCharacter();
        factory.getCharacter(2).printCharacter();
        factory.getCharacter(3).printCharacter();
        factory.getCharacter(1).printCharacter();
        factory.getCharacter(2).printCharacter();
        factory.getCharacter(3).printCharacter();

    }
}
