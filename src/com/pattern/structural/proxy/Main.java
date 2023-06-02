package com.pattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserProcessor.process(userDaoImpl);
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDaoImpl);
        userDaoProxy.save();
    }
}
