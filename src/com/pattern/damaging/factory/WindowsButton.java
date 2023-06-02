package com.pattern.damaging.factory;

public class WindowsButton implements Button{
    @Override
    public void execute() {
        System.out.println("do windows stuff");
    }
}
