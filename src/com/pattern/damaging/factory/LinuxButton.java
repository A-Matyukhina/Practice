package com.pattern.damaging.factory;

public class LinuxButton implements Button{
    @Override
    public void execute() {
        System.out.println("do linux stuff");
    }
}
