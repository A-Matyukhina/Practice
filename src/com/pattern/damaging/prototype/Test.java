package com.pattern.damaging.prototype;

public class Test implements Cloneable{
    private int elem;

    public Test(int elem) {
        this.elem = elem;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Test(this.elem);
    }

    @Override
    public String toString() {
        return "Test{" +
                "elem=" + elem +
                '}';
    }
}
