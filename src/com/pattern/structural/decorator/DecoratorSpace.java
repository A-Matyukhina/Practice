package com.pattern.structural.decorator;

public class DecoratorSpace extends Decorator{
    public DecoratorSpace(InterfaceComponent component) {
        super(component);
    }
    @Override
    public void doOperation() {
        System.out.print(" ");
        component.doOperation();
    }
}
