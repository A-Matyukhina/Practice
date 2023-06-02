package com.pattern.damaging.prototype;

import java.util.ArrayList;
import java.util.List;

public class MyObject implements Cloneable{
    private int myInt;
    private Test test;
    public List<Test> testList;


    public MyObject(int myInt, Test test, List<Test> testList) {
        this.myInt = myInt;
        this.test = test;
        this.testList = testList;
    }

    public int getMyInt() {
        return myInt;
    }

    public Test getTest() {
        return test;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<Test> list = new ArrayList<>();
        testList.forEach(e -> {
            try {
                list.add((Test)e.clone());
            } catch (CloneNotSupportedException ex) {
                ex.printStackTrace();
            }
        });
        return new MyObject(this.myInt, (Test)this.test.clone(), list);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "myInt=" + myInt +
                ", test=" + test +
                ", testList=" + testList +
                '}';
    }
}
