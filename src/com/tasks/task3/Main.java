package com.tasks.task3;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
//        System.out.println(counter.getCount());
//        counter.increment();
//        counter.increment();
//        counter.increment();
//        counter.increment();
//        counter.increment();
//        counter.increment();
//        counter.increment();
//
//        System.out.println(counter.getCount());
//        counter.decrement();
//        System.out.println(counter.getCount());
//        counter.decrement(3);
//        System.out.println(counter.getCount());
//        counter.increment(5);
//        System.out.println(counter.getCount());
//        counter.countReload();
//        System.out.println(counter.getCount());
//
        Counter counter1 = new Counter(11);
        counter1.increment(-15);
        System.out.println(counter1.getCount());
        counter1.decrement(-15);
        System.out.println(counter1.getCount());
    }
}
