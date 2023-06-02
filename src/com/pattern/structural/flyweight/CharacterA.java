package com.pattern.structural.flyweight;

public class CharacterA extends EnglishCharacter{

    public CharacterA() {
        symbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    void printCharacter() {
        System.out.println("symbol = " + symbol + " w = " + width + " h = " + height);
    }
}
