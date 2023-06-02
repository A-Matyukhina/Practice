package com.pattern.damaging.factory;

public class IosButton implements Button{
    @Override
    public void execute() {
        System.out.println("do ios stuff");
    }
}