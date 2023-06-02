package com.pattern.structural.decorator;

public class DecoratorCpmma extends Decorator{
    public DecoratorCpmma(InterfaceComponent component) {
        super(component);
    }
    @Override
    public void doOperation() {
        System.out.print(",");
        component.doOperation();
    }
}
