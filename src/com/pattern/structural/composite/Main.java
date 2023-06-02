package com.pattern.structural.composite;

public class Main {
    public static void main(String[] args) {
//        Bus bus = new Bus();
//        bus.draw("green");
//        SportCar sportCar = new SportCar();
//        sportCar.draw("green");
//        Truck truck = new Truck();
//        truck.draw("green");

        Composer composer = new Composer();
        composer.add(new Bus(), new Truck(), new SportCar());
        composer.draw("green");
        composer.draw("red");
        composer.add(new Bus(), new Truck());
        composer.draw("blue");
    }
}
