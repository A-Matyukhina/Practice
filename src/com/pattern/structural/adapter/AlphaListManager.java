package com.pattern.structural.adapter;

public class AlphaListManager implements AlphaList {

    @Override
    public void add(int value) {
        System.out.println("Add  Alpha to array in index " + value);
    }

    @Override
    public void get(int index) {
        System.out.println("get alpha from array in index " + index);
    }

    @Override
    public void remove(int index) {
        System.out.println("remove alpha from array in index " + index);
    }
}
