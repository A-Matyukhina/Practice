package com.pattern.damaging.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Test> testList = new ArrayList<>();
        testList.add(new Test(1));
        testList.add(new Test(2));
        MyObject myObject = new MyObject(10, new Test(11), testList);
        MyObject myObjectClone = (MyObject) myObject.clone();
        System.out.println(myObject);
        System.out.println(myObjectClone);
        System.out.println("----------------");

        myObjectClone.setMyInt(2);
        myObjectClone.getTest().setElem(4);
        myObjectClone.getTestList().add(new Test(3));
        System.out.println(myObject);
        System.out.println(myObjectClone);
        System.out.println("----------------");
    }
}
