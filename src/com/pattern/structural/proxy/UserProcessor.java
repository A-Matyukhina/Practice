package com.pattern.structural.proxy;

public class UserProcessor {
    public static void process(UserDao userDao){
        userDao.save();
    }
}
