package com.pattern.structural.flyweight;

public class CharacterB extends EnglishCharacter{
    public CharacterB() {
        symbol = 'B';
        width = 11;
        height = 21;
    }

    @Override
    void printCharacter() {
        System.out.println("symbol = " + symbol + " w = " + width + " h = " + height);
    }
}
