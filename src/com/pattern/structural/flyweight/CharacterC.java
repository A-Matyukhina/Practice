package com.pattern.structural.flyweight;

public class CharacterC extends EnglishCharacter{
    public CharacterC() {
        symbol = 'C';
        width = 12;
        height = 22;
    }

    @Override
    void printCharacter() {
        System.out.println("symbol = " + symbol + " w = " + width + " h = " + height);
    }
}
