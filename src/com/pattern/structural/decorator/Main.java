package com.pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Decorator decorator = new decoratorHello(new DecoratorCpmma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
    }
}
