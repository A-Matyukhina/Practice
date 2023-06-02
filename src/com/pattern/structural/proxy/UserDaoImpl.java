package com.pattern.structural.proxy;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("The data has saved");
    }
}
