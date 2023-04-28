package com.tasks.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(12,20,30);
        Clock clock1 = new Clock(11, 20,25);
        Clock clock2 = new Clock(24,01,01);
        Clock clock3 = new Clock(12,20,30);
        clock.setMinute(clock1.getMinute());
//        clock.addMinute(80);
//        System.out.println(clock);
        clock.addSecond(1000);
        System.out.println(clock);
    }
}
