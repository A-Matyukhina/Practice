package com.pattern.damaging.abstractFactory;

public class Main {
    public static void main(String[] args) {
        CommonCarFactory.getFactory(Type.TOYOTA).createCoupe();
        CommonCarFactory.getFactory(Type.FORD).createCoupe();
        CommonCarFactory.getFactory(Type.FORD).createSedan();
        CommonCarFactory.getFactory(Type.TOYOTA).createSedan();
    }
}
