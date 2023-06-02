package com.pattern.structural.decorator;

public class decoratorHello extends Decorator{
    public decoratorHello(InterfaceComponent component) {
        super(component);
    }
    @Override
    public void doOperation() {
        System.out.print("Hello");
        component.doOperation();
    }
}
