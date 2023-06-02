package com.pattern.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<Integer, EnglishCharacter> characterHashMap = new HashMap<>();

    public EnglishCharacter getCharacter(int code){
        EnglishCharacter character = characterHashMap.get(code);
        if(character == null) {
            switch (code) {
                case 1:
                    character = new CharacterA();
                    break;
                case 2:
                    character = new CharacterB();
                    break;
                case 3:
                    character = new CharacterC();
                    break;
                default:
                    throw new IllegalArgumentException("");
            }
            System.out.println("Create symbol " + character.symbol);
            characterHashMap.put(code, character);
        }
        return character;
    }
}
