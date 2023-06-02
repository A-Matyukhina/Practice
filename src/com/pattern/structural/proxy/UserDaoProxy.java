package com.pattern.structural.proxy;

public class UserDaoProxy implements UserDao{
    UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("------проверка целостности данных---------");
        userDao.save();
        System.out.println("------проверка что данные доехали -----");
    }
}
